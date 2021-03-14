package com.pjs.demo.controller;


import com.pjs.demo.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
public class TestController {

    private TestService testService;

    @GetMapping(value = "/api/test")
    public String helloWorld() {
        return "HelloWorld";
    }


    @GetMapping(value = "/api/calculator")
    public int calculator(@RequestParam int number1, @RequestParam int number2, @RequestParam String type) {
        return testService.calculate(number1, number2, type);
    }

    @GetMapping(value = "/api/json")
    public Map returnJson() {
        return testService.makeTestJson();
    }

    @GetMapping(value = "/api/jsonList")
    public ArrayList<HashMap> returnJsonList() {
        return testService.makeTestJsonList();
    }

    @GetMapping(value = "/api/jsonPractice")
    public Map<String, Object>  returnJsonPractice() {
        return testService.makeTestJsonPractice();
    }
}

