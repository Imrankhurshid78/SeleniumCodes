package JavaRecapClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoProject {
    static WebElement categories, subMenu, course;
    public static String url = "https://edureka.co";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        categories = driver.findElement(By.xpath("//a[@class='cat_btn hidden-xs giTrackElementHeader']"));
        subMenu = driver.findElement(By.xpath("//li[@class='course_category_name_menu']//a[@id='software-testing-certification-courses']"));
        course = driver.findElement(By.id("c535"));

        Actions action = new Actions(driver);
        action.moveToElement(categories).perform();
        action.moveToElement(subMenu).perform();
        action.moveToElement(course).click().perform();
//  Thread.sleep(3000);

//  driver.close();
    }

}
///html/body/nav/div[1]/a/span

//a[@class='cat_btn hidden-xs giTrackElementHeader']