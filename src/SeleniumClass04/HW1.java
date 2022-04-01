package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
*/
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username =driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement button = driver.findElement(By.className("button"));
        button.click();
        WebElement logoimg =driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img"));
        if(logoimg.isDisplayed()){
            System.out.println("image displayed");
        }else{
            System.out.println("Not displayed");
        }
    }
}
