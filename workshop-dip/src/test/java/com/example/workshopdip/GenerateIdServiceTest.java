package com.example.workshopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GenerateIdServiceTest {

    @Autowired
    private GenerateIdService generateIdService;

    @Test
    @DisplayName("Start springboot test")
    public void case01(){
        String id = generateIdService.get();
        assertEquals("XYZ7",id);
    }

}