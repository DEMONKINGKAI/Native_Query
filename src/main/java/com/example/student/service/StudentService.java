
package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findStudentWithGpaGreaterThan(double gpa) {
        return studentRepository.findStudentWithGpaGreaterThan(gpa);
    }

    public Student createStudent(Student student) {

        return studentRepository.save(student);
    }
}