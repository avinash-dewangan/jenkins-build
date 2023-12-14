package com.springbootsample.jenkinsbuilddeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "<h1>Hello Jenkins</h1>, 'Pulled git project, Maven build and Deploy by jenkins'";

    }
}
