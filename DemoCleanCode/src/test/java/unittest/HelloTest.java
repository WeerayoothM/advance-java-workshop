package unittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("ทำการทดสอบกับ Database (I = Isolate/Independent)")
    public void case02(){
        Hello hello = new Hello();
        String name = hello.workWithDb(1);
        assertEquals("Weerayooth",name);
    }

    @Test
    @DisplayName("นี่คือ case แรกของการเขียนนะ")
    public void case01(){
        // Arrange == Given == Pre condition
        Hello hello = new Hello();
        // Action == When == Call target method
        String actualResult = hello.hi("Weerayooth");
        // Assert == Validate
        assertEquals("Hello, Weerayooth",actualResult);

    }

}