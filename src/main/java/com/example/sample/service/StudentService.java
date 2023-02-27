package com.example.sample.service;

import com.example.sample.entity.Student;
import com.example.sample.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }


    // Get All
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }


    // Get Id
    public Student getIdStudents(String studentId) {
//        return studentRepo.findOne(studentId);
        return studentRepo.findById(studentId).get();
    }

    // Update
    public Student updateStudents(Student changeStudent) {
        return studentRepo.save(changeStudent);
    }

    // Delete
    public String deleteById(String studentId) {
//        studentRepo.delete(studentId);
        studentRepo.deleteById(studentId);
        return "Deleted Successfully";

    }

}
