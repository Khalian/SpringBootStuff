package com.example.springbootstuff;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    List<Topic> topics= List.of(new Topic("r1", "i1", "d1"), new Topic("r2", "i2", "d2"));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(final String id) {
        return topics.stream().filter(i -> id.equals(i.id())).findFirst().get();
    }

    public void addTopic(final Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(final Topic topic, final String id) {
        for (int i = 0; i < topics.size(); i++) {
            final var t = topics.get(i);
            if (t.id().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(final String id) {
        topics.removeIf(t -> t.id().equals(id));
    }
}


record Topic(String name, String id, String description) {}
