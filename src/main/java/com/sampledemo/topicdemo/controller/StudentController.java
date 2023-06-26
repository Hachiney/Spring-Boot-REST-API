package com.sampledemo.topicdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sampledemo.topicdemo.model.Student;
import com.sampledemo.topicdemo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable long id){
        return studentService.getStudent(id);

    }
    
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("/students/update/{id}")
    public void updateStudentInfo(@PathVariable long id, @RequestBody Student newInfo){
        studentService.updateStudentInfo(id, newInfo);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable long id){
        studentService.deleteStudent(id);
    }
}
