package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.*/
public class HW3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username =driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        //WebElement password=driver.findElement(By.id("txtPassword"));
        //password.sendKeys("Hum@nhrm123");
        WebElement button = driver.findElement(By.className("button"));
        button.click();
        WebElement errorMsg=driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));
        boolean errorMsgDisplayed=errorMsg.isDisplayed();
        if(errorMsgDisplayed){
            System.out.println("Error message is displayed");
        }else{
            System.out.println("Error message not displayed");
        }
        driver.quit();

    }
}
