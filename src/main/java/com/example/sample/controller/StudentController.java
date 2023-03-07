package com.example.sample.controller;

import com.example.sample.entity.Student;
import com.example.sample.service.StudentService;
//import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;
//import java.util.logging.Logger;

@RestController
@RequestMapping("api/user")
@Slf4j
public class StudentController {
//    private static final Logger logger = (Logger) LoggerFactory.getLogger(StudentController.class);

//    Logger logger = (Logger) LoggerFactory.getLogger(StudentController.class);

//    Logger logger = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public Student addStudent(@RequestBody Student student) {
        log.error("Error is created.................");
        log.info("Info is created...................");
        log.debug("Debug is created.................");
        log.trace("Trace is Message.................");
        log.warn("This is also warn message.........");
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

    @PutMapping("/add/{studentId}")
    public Student updateStudents(@RequestBody Student changeStudent){
        return studentService.updateStudents(changeStudent);
    }

    @DeleteMapping("/students/{studentId}")
    public String deleteStudentId(@PathVariable String studentId){
        return studentService.deleteById(studentId);
    }
}
