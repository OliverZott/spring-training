package org.velosaurus.myapp_01.rest;

import jdk.jfr.SettingDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${my.name}")
    private String name;

    @Value("${user.jdk}")
    private String jdk;

    @GetMapping("/")
    public String Main() {
        return "Spring Boot Application using: " + jdk;
    }

    @GetMapping("/hello")
    public String GetHello() {
        return "Hello " + name;
    }
}
