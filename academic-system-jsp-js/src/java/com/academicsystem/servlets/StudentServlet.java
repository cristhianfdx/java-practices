package com.academicsystem.servlets;

import com.academicsystem.services.StudentService;
import com.academicsystem.dto.StudentDTO;
import com.academicsystem.servlets.util.JsonUtilConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JsonObject;

/**
 *
 * @author cristhiandgz
 */

@WebServlet(name = "StudentServlet", urlPatterns = {"/students"})
public class StudentServlet extends HttpServlet
{
    private final StudentService studentService;
    private final ObjectMapper mapper;   

    public StudentServlet(){
        this.studentService = new StudentService();
        mapper = new ObjectMapper(); 
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException
    {
        response.setContentType("application/json");
                
        PrintWriter writer = response.getWriter();
        writer.write(studentsToJson(studentService.findAll()));
                
        
    }  
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws IOException          
    {           
        response.setContentType("application/json");        
        String jsonRequest = JsonUtilConverter.requestToJson(request);
        studentService.create(jsonToStudent(jsonRequest));
        PrintWriter writer = response.getWriter();
        JsonObject obj = new JsonObject();
        obj.put("status", "created");       
        
        writer.write(obj.toJson());
        
        
       
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
    {
        
        
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
    {
        
    }
    
    public StudentDTO jsonToStudent(String jsonData) throws IOException
    {       
       return mapper.readValue(jsonData, StudentDTO.class);
    }  
    
    public String studentsToJson(List<StudentDTO> list) throws IOException{    
        return new Gson().toJson(list);
    }
    
    
    
}
