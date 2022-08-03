package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
    @Parameters({"URL"})
    @Test(groups = "Smoke")
    public void WebloginCarLoan(String urlname) {
        System.out.println(urlname);
        System.out.println("weblogincar");
    }

    @Test()
    public void MobileLoginCarLoan() {
        //mobile
        System.out.println("mobilelogincar");
    }

    @Test
    public void MobileLogoutCarLoan() {
        //mobile
        System.out.println("mobilelogoutcar");
    }

    @Test(dependsOnMethods = {"WebloginCarLoan"})
    public void LoginAPICarLoan() {
        //API
        System.out.println("APIlogincar");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "firstsetusername";
        data[0][1] = "password";

        data[1][0] = "secondsetusername";
        data[1][1] = "secondpassword";

        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdpassword";
        return data;
    }

    @Test(dataProvider = "getData")
    public void login(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }
}
