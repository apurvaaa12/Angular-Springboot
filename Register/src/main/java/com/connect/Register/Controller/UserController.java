package com.connect.Register.Controller;

import com.connect.Register.Model.User;
import com.connect.Register.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


   @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "You're Inside Register Application";
    }

    @GetMapping("/findUser/{email}")
    public List<User> findUser(@PathVariable String email) {
        return userRepository.findByEmail(email);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userRepository.save(user);
        return "Hello " + user.getName() + " your Registration process successfully completed";
    }
}
