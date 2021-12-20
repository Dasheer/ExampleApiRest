package mx.edu.itescam.dasheer.app.apirest.controllers;

import mx.edu.itescam.dasheer.app.apirest.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
