package com.brkbthn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/v1", "/api/v2"})
public class PersonelController {
    //http://localhost:8080/api/v1/hello
    //http://localhost:8080/api/v1/Merhaba
    //http://localhost:8080/api/v2/Hello
    //http://localhost:8080/api/v2/Merhaba
    @GetMapping({"/Hello", "Merhaba"})
    public String getDockerHello(){
        return "Selam Docker";
    }
}
