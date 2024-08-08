package userdeptapi.userdeptapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import userdeptapi.userdeptapi.entities.Department;
import userdeptapi.userdeptapi.entities.User;
import userdeptapi.userdeptapi.repositories.DepartmentRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping
    public ResponseEntity<List<Department>> findAll() {
        List<Department> result = repository.findAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Department> findById(@PathVariable Long id) {
        Department result = repository.findById(id).get();
        return ResponseEntity.ok().body(result);
    }

    @PostMapping()
    public ResponseEntity<Department> insert(@RequestBody Department department) {
        Department result = repository.save(department);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete (@PathVariable Long id) {
        repository.deleteById(id);

        return ResponseEntity.ok("Departamento excluído");
    }

}
