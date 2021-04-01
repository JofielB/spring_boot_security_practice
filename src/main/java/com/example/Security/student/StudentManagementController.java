package com.example.Security.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> students = Arrays.asList(
            new Student(1, "Jofiel Batista"),
            new Student(2, "Melquiades Batista"),
            new Student(3, "Solovino Batista")
    );

    @GetMapping
    public List<Student> getAllStudents() {
        System.out.println("getAllStudents");
        return students;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println("registerNewStudent");
        System.out.println(student.toString());
    }

    @DeleteMapping("{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId) {
        System.out.println("deleteStudent");
        System.out.println(students.get(studentId));
    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody Student student) {
        System.out.println("updateStudent");
        System.out.printf("%d %s \n", studentId, student.toString());
    }
}
