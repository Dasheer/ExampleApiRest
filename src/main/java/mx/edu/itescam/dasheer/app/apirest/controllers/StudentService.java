package mx.edu.itescam.dasheer.app.apirest.controllers;

import mx.edu.itescam.dasheer.app.apirest.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Student getStudent(Integer id){
        return studentRepository.getById(id);
    }

    public void update(Student student){
        studentRepository.save(student);
    }

    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
