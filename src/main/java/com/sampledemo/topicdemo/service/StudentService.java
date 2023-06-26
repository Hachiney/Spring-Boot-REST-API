package com.sampledemo.topicdemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampledemo.topicdemo.model.Student;
import com.sampledemo.topicdemo.repository.StudentRepository;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>(Arrays.asList(
        new Student(101, "Habtom", "habtom@gemail.com"),
        new Student(102, "Haregu", "Haregu@email.com"),
        new Student(103, "Tesfay", "tesfay@email.com")
    ));


    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }


    // CRUD Operations (Create-Read-Update-Delete)
    
    // C-reate
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    // Read
    public Student getStudent(long id){
        return studentRepository.findById(id).get();
    }

    // Update
    public void updateStudentInfo(long id, Student newInfo){
        Student target = studentRepository.findById(id).get();
        target.setName(newInfo.getName());
        target.setEmail(newInfo.getEmail());
        studentRepository.save(target);

    }

    // Delete
    public void deleteStudent(long id){
        studentRepository.deleteById(id);  

    }


}
