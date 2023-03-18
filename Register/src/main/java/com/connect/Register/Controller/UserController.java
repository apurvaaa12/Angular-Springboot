package com.connect.Register.Controller;

import com.connect.Register.Model.User;
import com.connect.Register.Repository.UserRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


   @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "Hello-World", notes ="Hello")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Okay"),
            @ApiResponse(code = 404, message = "Invalid-Request"),
            @ApiResponse(code = 408, message = "Timeout"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "You're Inside Register Application";
    }

    @ApiOperation(value = "find-user", notes ="Hello")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Okay"),
            @ApiResponse(code = 404, message = "Invalid-Request"),
            @ApiResponse(code = 408, message = "Timeout"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @GetMapping("/findUser/{email}")
    public List<User> findUser(@ApiParam(name = "Email", value = "email") @PathVariable String email) {
        return userRepository.findByEmail(email);
    }

    @ApiOperation(value = "Register", notes ="Hello")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Okay"),
            @ApiResponse(code = 404, message = "Invalid-Request"),
            @ApiResponse(code = 408, message = "Timeout"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userRepository.save(user);
        return "Hello " + user.getName() + " your Registration process successfully completed";
    }

    @GetMapping("/getAllUsers")
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
