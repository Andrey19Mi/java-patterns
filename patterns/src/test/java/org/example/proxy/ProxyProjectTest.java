package org.example.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@Slf4j
class ProxyProjectTest {

    private String url;

    @BeforeEach
    void setUp() {
        url = "https://github.com/Andrey19Mi/java-patterns";
    }

    @Test
    void run() {
        ProxyProject proxyProject = new ProxyProject(url);
        log.info("Прокси проект создан");
        proxyProject.run();
    }

}