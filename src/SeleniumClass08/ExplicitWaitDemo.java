package SeleniumClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    /*
    click on get new user
    get the firstname text
    print on the console
     */
    public static String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement getNewUserButton = driver.findElement(By.id("save"));
        getNewUserButton.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First name')]")));

        WebElement firstName=driver.findElement(By.xpath("//p[contains(text(),'First name')]"));
        System.out.println(firstName.getText());
    }
}