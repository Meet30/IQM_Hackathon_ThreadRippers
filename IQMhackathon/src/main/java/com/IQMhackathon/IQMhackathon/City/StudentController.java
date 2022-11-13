package com.IQMhackathon.IQMhackathon.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    // GET
    @RequestMapping(method = RequestMethod.GET, value = "/student/")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    // POST
    @CrossOrigin(maxAge = 3600)
    @RequestMapping(method = RequestMethod.POST, value = "/student/")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    // DELETE
    @CrossOrigin(maxAge = 3600)
    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
    }
}

