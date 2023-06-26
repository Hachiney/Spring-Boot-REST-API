package com.sampledemo.topicdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.sampledemo.topicdemo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
}
