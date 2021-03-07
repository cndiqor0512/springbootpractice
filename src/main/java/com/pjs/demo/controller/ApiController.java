package com.pjs.demo.controller;


import com.pjs.demo.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "a")
@RestController
@AllArgsConstructor
public class ApiController {//요청을 받아주는 역할을

    private TestService testService;

    @GetMapping(value = "/test")
    public String controllerTest() {
        return testService.testService();
    }
    @GetMapping(value = "/calculate")
    public int calculate(@RequestParam int number1,@RequestParam int number2,@RequestParam String type) {
        return testService.calculate(number1,number2,type);
    }

}
