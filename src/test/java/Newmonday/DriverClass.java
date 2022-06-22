package Newmonday;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DriverClass {
    @BeforeTest
    public void setup(){
        System.out.println("TEST_MARIO");
    }
    @Test
    public void a(){
        System.out.println("Forza Napoli");
    }
}

