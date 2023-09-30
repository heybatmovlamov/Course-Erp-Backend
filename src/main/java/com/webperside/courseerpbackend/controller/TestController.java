package com.webperside.courseerpbackend.controller;

import com.webperside.courseerpbackend.repository.UserRepository;
import com.webperside.courseerpbackend.entity.Users;
import com.webperside.courseerpbackend.model.base.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final UserRepository userRepository;

    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/test")
    public BaseResponse<String> test(){
        return BaseResponse.success("ERP course");
    }
    @PostMapping("/users")
    public BaseResponse<String> postSave(@RequestBody Users users){
        userRepository.save(users);
        return BaseResponse.success("saved");
    }
    @GetMapping("/users")
    public BaseResponse<Users> getUser (){
        return BaseResponse.success(userRepository.getUserEnById(1));
    }
}
