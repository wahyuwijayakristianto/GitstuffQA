package Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {
    @AfterTest
    public void AfterTest() {
        System.out.println("after test");
    }

    @Test
    public void Nama() {
        System.out.println("wahyu");
    }

    @Test
    public void Umur() {
        System.out.println("22");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("before test");
    }
}
