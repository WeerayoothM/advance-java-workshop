package unittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

class UserDBWithSuccess implements UserDB {
    @Override
    public String getNameById(int id ){
        return "Weerayooth";
    }
}

class HelloTest {

    @Test
    @DisplayName("ทำการทดสอบกับ Database (I = Isolate/Independent)")
    public void case02(){
        Hello hello = new Hello();
        hello.userDB = new UserDBWithSuccess();
        String name = hello.workWithDb(1);

        assertEquals("Weerayooth",name);
    }

    @Test
    @DisplayName("เกิด exception เมื่อค้นหาผู้ใช้งาน id = 2 ไม่เจอ")
    public void case03(){
        Hello hello = new Hello();
        hello.userDB = id -> {
            throw new UserNotFoundException("Id=" + id + " not found");
        };
        Exception exception = assertThrows(UserNotFoundException.class, () ->
            hello.workWithDb(2));
        assertEquals("Id=2 not found",exception.getMessage());
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