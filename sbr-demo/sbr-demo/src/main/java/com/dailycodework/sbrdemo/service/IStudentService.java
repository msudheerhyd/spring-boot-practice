package com.dailycodework.sbrdemo.service;

import com.dailycodework.sbrdemo.model.Student;

import java.util.List;

public interface IStudentService {

    Student addStudent(Student student);
    List<Student> getStudents();

    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
