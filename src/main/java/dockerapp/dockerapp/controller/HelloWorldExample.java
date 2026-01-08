package dockerapp.dockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldExample {

    @GetMapping("/hello")
    public String getMessage() {
        return "Hello World from Docker + Spring Boot + Test by krishna";
    }
}
