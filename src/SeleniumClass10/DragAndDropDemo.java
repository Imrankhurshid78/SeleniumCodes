package SeleniumClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

        public static String url = "http://jqueryui.com/droppable";

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();

            driver.switchTo().frame(0);
            WebElement draggable=driver.findElement(By.id("draggable"));
            WebElement droppable=driver.findElement(By.id("droppable"));

            Actions action=new Actions(driver);
            //action.dragAndDrop(draggable,droppable).perform();
            //Manually Action
            //before perform need click and hold to drag and then move that draggable element
            //then release that Element to your designated area
            //when performing multiple action we need to build into single connection
            //then perform
            action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

    }
}
