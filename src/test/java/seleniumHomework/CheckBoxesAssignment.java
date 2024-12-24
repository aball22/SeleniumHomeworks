package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckBoxesAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        // 1) Subscribe to Newsletter:
        //   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.
        WebElement subscribeToNewsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        boolean stateOfSubscribe = subscribeToNewsletter.isEnabled();
        if (stateOfSubscribe) {
            subscribeToNewsletter.click();
        }
        // 2) Select Your Hobbies:
        //   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
        List<WebElement> yourHobbies = driver.findElements(By.xpath("//input[@class='cb-element']"));
        //   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.
        for (WebElement hobbies : yourHobbies) {
            if (hobbies.getAttribute("value").equals("reading")){
                hobbies.click();
            } if (hobbies.getAttribute("value").equals("cooking")) {
                hobbies.click();
            }
        }
        // 3) Select Your Interests:
        //   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
        WebElement support = driver.findElement(By.xpath("//input[@value='Support']"));
        boolean displayStateOfSupport = support.isDisplayed();
        System.out.println("Support checkbox is enabled: " + displayStateOfSupport);
        WebElement music = driver.findElement(By.xpath("//input[@value='Music']"));
        boolean displayStateOfMusic = music.isDisplayed();
        System.out.println("Music checkbox is enabled: " + displayStateOfMusic);
        //   - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.
        WebElement showCheckboxes = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        showCheckboxes.click();

        Thread.sleep(2000);
        music.click();
        // 4) Preferences:
        //   - Verify that the **Receive Notifications** checkbox is disabled.
        //   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.
        WebElement receiveNotifications = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        WebElement enableCheckboxes = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        boolean stateOfRNBox = receiveNotifications.isEnabled();
        System.out.println("The Receive Notifications checkbox is enabled: " + stateOfRNBox);

        if (!stateOfRNBox) {
            enableCheckboxes.click();
        }
        Thread.sleep(2000);
        receiveNotifications.click();
    }
}
