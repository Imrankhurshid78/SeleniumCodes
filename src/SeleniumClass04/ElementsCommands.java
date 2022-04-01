package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement marriedRadioButton = driver.findElement(By.xpath("(//input[@name = 'optradio'])[1])"));

        boolean isMarriedRadioButtonEnabled=marriedRadioButton.isEnabled();
        System.out.println(isMarriedRadioButtonEnabled);

        if(!isMarriedRadioButtonEnabled){
            System.out.println("not enabled");
        }else {
            System.out.println("Enabled");
        }
        boolean isMarriedRadioButtonDisplayed = marriedRadioButton.isDisplayed();
        System.out.println(isMarriedRadioButtonDisplayed);
        boolean isMarriedRadioButtonSelected = marriedRadioButton.isSelected();
        System.out.println("Before Clicking"+isMarriedRadioButtonSelected);
        marriedRadioButton.click();
        System.out.println("After Clicking"+isMarriedRadioButtonSelected);

    }
}
