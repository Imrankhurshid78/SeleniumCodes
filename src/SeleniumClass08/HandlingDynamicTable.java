package SeleniumClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        WebElement passWord=driver.findElement(By.id("ctl00_MainContent_password"));
        passWord.sendKeys("test");

        WebElement loginButton=driver.findElement(By.className("button"));
        loginButton.click();

        List<WebElement> rows=driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr"));
        for (int i=1; i< rows.size();i++){
            String rowText=rows.get(i).getText();//Getting text from all rows
            System.out.println(rowText);
            if (rowText.contains("Bob Feather")){//finding rows which contains our desire data or text
                List<WebElement> checkBox=driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr/td[1]"));
                checkBox.get(i-1).click();//calculate to find the box to checked
            }
        }


    }
}
