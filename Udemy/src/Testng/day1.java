package Testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
    @Parameters({"URL"})
    @Test
    public void demo(String facebook){
        System.out.println("hello");
        System.out.println(facebook);
    }

    @Test
    public void SecondTest(){
        System.out.println("bye");
    }
}
