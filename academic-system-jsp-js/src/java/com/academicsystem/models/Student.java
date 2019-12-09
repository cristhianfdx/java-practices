package com.academicsystem.models;

import lombok.Data;

/**
 *Class representing the entity students 
 * @author Cristhian Forero
 */

@Data
public class Student {
    
    private Integer idStudent;
    private String nameStudent;
    private String lastnameStudent;
    private String documentNumberStudent;
    private String passwordStudent;   
    
}
