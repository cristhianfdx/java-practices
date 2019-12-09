package com.academicsystem.repository;

import com.academicsystem.dto.StudentDTO;
import java.util.List;

/**
 *
 * @author cristhiandgz
 * 
 */
public interface StudentRepository {
    
    public StudentDTO createStudent(StudentDTO student);
    public StudentDTO updateStudent(StudentDTO student);
    public void deleteStudent(StudentDTO student);    
    public List<StudentDTO> findAllStudents();
    public StudentDTO finByDocumentNumber(String documentNumberStudent);
    
}
