package Test;

import Pages.LoginPage;
import TestBase.BaseClass;

public class LoginPageTest extends LoginPage{
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        LoginPage loginPage=new LoginPage();
       // loginPage.username.sendKeys("Tester");
        //loginPage.password.sendKeys("test");
        //loginPage.loginButton.click();

    }
}
