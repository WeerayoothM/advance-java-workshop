package com.example.workshopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GenerateIdServiceTest {

    @Autowired
    private GenerateIdService generateIdService;

    @MockBean
    private Random random;

    @Test
    @DisplayName("Start springboot test")
    public void case01(){
        Mockito.when(random.nextInt(10)).thenReturn(7);

        String id = generateIdService.get();
        assertEquals("XYZ7",id);
    }

}