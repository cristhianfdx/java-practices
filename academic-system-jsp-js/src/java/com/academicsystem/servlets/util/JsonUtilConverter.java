package com.academicsystem.servlets.util;

import com.google.gson.JsonParser;
import java.io.BufferedReader;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author cristhiandgz
 */
public class JsonUtilConverter {
    
    public static String requestToJson(HttpServletRequest request)
    {        
        StringBuilder buffer = new StringBuilder();
        JsonParser jsonParser = new JsonParser();
        String json = null;
	
        try{
            BufferedReader reader = request.getReader();
            while((json = reader.readLine()) != null)
                buffer.append(json);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return String.valueOf(jsonParser.parse(buffer.toString()).getAsJsonObject());           
    }
    
    

    
    
    
    
}
