package com.example.jenkinstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class JenkinsTestApplicationTests {

    @Autowired
    private JenkinsTestApplication jenkinsTestApplication;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnDefaultMessage() {
        Assertions.assertEquals("Hello world", jenkinsTestApplication.hello());
    }

//    @Test
//    void testToFail() {
//        Assertions.assertEquals("Test to fail", jenkinsTestApplication.hello());
//    }

}
