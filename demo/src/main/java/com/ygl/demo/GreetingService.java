package com.ygl.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private GreetingMapper greetingMapper;

    public GreetingService(GreetingMapper greetingMapper) {
        this.greetingMapper = greetingMapper;
    }

    public List<Greeting> getAllGreetings() {
        return greetingMapper.findAll();
    }
}
