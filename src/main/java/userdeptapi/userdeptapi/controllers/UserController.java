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
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public User insert (@RequestBody User user) {
        return repository.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity remove (@PathVariable Long id) {
        repository.deleteById(id);

        return ResponseEntity.ok("usuário deletado !");
    }
}
