package com.ygl.demo;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/hello")
    public String hello() {
        return "hi hello say yo";
    }

    @GetMapping("/info")
    public String info() {
        return "asdflksadlfkjsdfkjsdfjsaldfjsdalkfjsaldkfjadslfjlasdfjasldfjsaldfjsdlfjasdflksadlkfjsadfjasdlkfasdlfkjasdflkasjdflhi hello say yo";
    }

    @GetMapping("/mybatis")
    public Greeting mybatis() {
        List<Greeting> allGreetings = greetingService.getAllGreetings();
        return allGreetings.get(0);
    }

}