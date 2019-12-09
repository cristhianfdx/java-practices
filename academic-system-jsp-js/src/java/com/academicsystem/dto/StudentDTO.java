package com.academicsystem.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.*;
import lombok.Data;

/**
 *
 * @author cristhiandgz
 */

@Data
public class StudentDTO implements Serializable{
    
    @JsonProperty("id_student")
    private Integer idStudent;
    
    @JsonProperty("name")
    private String nameStudent;
    
    @JsonProperty("lastname")
    private String lastnameStudent;
    
    @JsonProperty("document_number")
    private String documentNumberStudent;
    
    @JsonProperty("password")
    private String passwordStudent;
    
    @JsonProperty("role_id")
    private Integer roleId;

    /*
    @Override
    public String toString() {
        return "Student{"+
                "id_student='"+ idStudent +'\''+
                "name='"+ nameStudent +'\''+
                "lastname='"+ lastnameStudent +'\''+
                "document_number='"+ documentNumberStudent +'\''+
                "password='"+ passwordStudent +'\''+
                '}';
    }
*/

}
