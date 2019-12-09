package com.academicsystem.services;

import com.academicsystem.repository.impl.StudentRepositoryImpl;
import com.academicsystem.dto.StudentDTO;
import java.util.List;

/**
 *
 * @author cristhiandgz
 */
public class StudentService{
    
    private final StudentRepositoryImpl studentRepository;

    public StudentService() {
        this.studentRepository = new StudentRepositoryImpl();
    }
           
    public StudentDTO create(StudentDTO studentDTO){        
        return this.studentRepository.createStudent(studentDTO);
    }
    
    public StudentDTO update(StudentDTO student){
        return this.studentRepository.updateStudent(student);
    }
    
    public void delete(StudentDTO student){
        this.studentRepository.deleteStudent(student);
    }
    
    public List<StudentDTO> findAll(){
        return this.studentRepository.findAllStudents();
    }

    
    
}
