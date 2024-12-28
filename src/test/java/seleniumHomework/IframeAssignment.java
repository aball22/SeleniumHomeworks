package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        // 1) Select Age Checkbox:
        driver.switchTo().frame("dropdownIframe");
        //   - Select the **Age** checkbox.
        WebElement ageNestedFrame = driver.findElement(By.xpath("//iframe[@name='checkbox-iframe']"));
        driver.switchTo().frame(ageNestedFrame);
        WebElement checkBox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkBox.click();
        // 2) **Select City**:
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        //   - Select any city from the dropdown.
        WebElement cityDD = driver.findElement(By.xpath("//select[@id='cities']"));
        Select selectCity = new Select(cityDD);
        selectCity.selectByValue("Chicago");
        // 3) **Enter Username**:
        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
        //   -enter your username in the **Username** field.
        WebElement username = driver.findElement(By.xpath("//input[@name='Username']"));
        username.sendKeys("BelcherB1");
    }
}
