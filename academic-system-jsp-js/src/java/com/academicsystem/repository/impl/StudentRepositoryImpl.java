package com.academicsystem.repository.impl;

import com.academicsystem.dbconnection.DbConnection;
import com.academicsystem.dto.StudentDTO;
import com.academicsystem.repository.StudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author cristhiandgz
 */
public class StudentRepositoryImpl implements StudentRepository{
    
    private Connection connection;    
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet; 

    @Override
    public StudentDTO createStudent(StudentDTO student) 
    {
        try {
            
            connection = DbConnection.getConnection();
            
            String sql = "INSERT INTO students (name, lastname, document_number, password) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
                        
            preparedStatement.setString(1, student.getNameStudent());
            preparedStatement.setString(2, student.getLastnameStudent());
            preparedStatement.setString(3, student.getDocumentNumberStudent());
            preparedStatement.setString(4, student.getPasswordStudent());               
            
            if(preparedStatement.executeUpdate() < 0) throw new Exception();            
                       
            
        } catch (SQLException e) {
            Logger.getLogger(StudentRepositoryImpl.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception ex) {
            Logger.getLogger(StudentRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return student;
    }
    
    @Override
    public StudentDTO updateStudent(StudentDTO student) 
    {
        return null;
    }

    @Override
    public void deleteStudent(StudentDTO student) 
    {
       
    }    

    @Override
    public List<StudentDTO> findAllStudents() 
    {
        List <StudentDTO> students = new ArrayList<>();
        resultSet = null;
        
        try {
            
            connection = DbConnection.getConnection();
            
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM students");
                        
            while(resultSet.next()){
                StudentDTO student = new StudentDTO();
                student.setIdStudent(resultSet.getInt("id_student"));
                student.setNameStudent(resultSet.getString("name"));
                student.setLastnameStudent(resultSet.getString("lastname"));
                student.setDocumentNumberStudent(resultSet.getString("document_number"));
                student.setPasswordStudent(resultSet.getString("password"));
                
                students.add(student);                  
            }
            
            resultSet.close();          
            
        } catch (SQLException e) {
            Logger.getLogger(StudentRepositoryImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return students;
    }

    @Override
    public StudentDTO finByDocumentNumber(String documentNumberStudent) {
        return null;
    }

    
    
}
