package org.example.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierTest {

    private Notifier logNotifier;
    private Notifier emailNotifier;
    private Notifier smsNotifier;

    @BeforeEach
    void setUp() {
        logNotifier = new LogNotifier(Priority.LOW.getLevel());
        emailNotifier = new EmailNotifier(Priority.MEDIUM.getLevel());
        smsNotifier = new SMSNotifier(Priority.HIGH.getLevel());

        logNotifier.setNext(emailNotifier);
        emailNotifier.setNext(smsNotifier);
    }

    @Test
    void testNotifierManager() {
        logNotifier.notifierManager("Hello world!", Priority.HIGH.getLevel());
    }
}