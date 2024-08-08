package userdeptapi.userdeptapi.controllers;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import userdeptapi.userdeptapi.entities.User;
import userdeptapi.userdeptapi.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> result = repository.findAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return ResponseEntity.ok().body(result);
    }

    @PostMapping
    public ResponseEntity<User> insert (@RequestBody User user) {
        return ResponseEntity.ok().body(repository.save(user));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity remove (@PathVariable Long id) {
        repository.deleteById(id);

        return ResponseEntity.ok("usuário deletado !");
    }
}
