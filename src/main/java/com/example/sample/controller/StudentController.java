package com.example.sample.controller;

import com.example.sample.entity.Student;
import com.example.sample.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }

    @GetMapping("/students")
    public List <Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/students/{id}")
    public Student getIdStudent(@PathVariable("id") String studentId){
        return studentService.getIdStudents(studentId);
    }

    @PutMapping("/add")
    public Student updateStudents(@RequestBody Student changeStudent){
        return studentService.updateStudents(changeStudent);
    }

    @DeleteMapping("/student/{studentId}")
    public String deleteStudentId(@PathVariable String studentId){
        return studentService.deleteById(studentId);
    }
}
