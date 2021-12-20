package mx.edu.itescam.dasheer.app.apirest.controllers;

import mx.edu.itescam.dasheer.app.apirest.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class IndexController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> students() {
        List<Student> studentList = new ArrayList<>();
        return studentList;
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        //System.out.print(student);
        studentService.save(student);
        return student;
    }

    @GetMapping("/students")
    public List<Student> get(){
        return studentService.getAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") Integer id){
        return studentService.getStudent(id);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Student student){
        studentService.update(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") Integer id) {
        studentService.delete(id);
    }
}
