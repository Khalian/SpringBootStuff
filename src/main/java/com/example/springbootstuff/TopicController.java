package com.example.springbootstuff;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return List.of(new Topic("r1", "i1", "d1"), new Topic("r2", "i2", "d2"));
    }
}

record Topic(String name, String id, String description) {}
