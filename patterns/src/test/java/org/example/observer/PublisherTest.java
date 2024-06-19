package org.example.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class PublisherTest {

    private Publisher publisher;
    private List<String> posts;
    private List<Observer> subscribers;
    private Observer observer1;
    private Observer observer2;

    @BeforeEach
    void setUp() {
        posts = new ArrayList<>();
        posts.add("Post 1");
        posts.add("Post 2");

        observer1 = Mockito.mock(Observer.class);
        observer2 = Mockito.mock(Observer.class);

        subscribers = new ArrayList<>();
        subscribers.add(observer1);
        subscribers.add(observer2);

        publisher = new Publisher(posts, subscribers);
    }

    @Test
    void testSendPosts() {
        publisher.sendPosts();
        verify(observer1, times(1)).handleEvent(posts);
        verify(observer2, times(1)).handleEvent(posts);
    }
}