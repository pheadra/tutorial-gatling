package webservice.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webservice.model.Greeting;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public Greeting greeting() {
        return new Greeting("Hello, World");
    }
}