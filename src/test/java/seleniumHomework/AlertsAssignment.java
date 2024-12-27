package seleniumHomework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        // 1) Birthday Reminder:
        WebElement birthdayAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        //   - Click on the "Birthday Reminder" button.
        birthdayAlert.click();
        Thread.sleep(2000);
        //   - When the alert appears, accept the alert.
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // 2) Delete Confirmation:
        WebElement deleteAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        //   - Click on the **"Delete File"** button.
        deleteAlert.click();
        Thread.sleep(2000);
        //   - When the confirmation alert appears, **dismiss** the alert.
        alert.dismiss();
        //   - Print the status of the action (e.g., "File deletion canceled")
        //   that appears on the screen, to the console.
        WebElement printDismissMessage = driver.findElement(By.id("confirm-demo"));
        System.out.println("Confirm my selection: " + printDismissMessage.getText());
        // 3) Name Collection:
        WebElement nameAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        //   - Click on the **"Enter Your Name"** button.
        nameAlert.click();
        Thread.sleep(2000);
        //   - Accept the alert and provide a name.
        alert.sendKeys("Bob Belcher");
        alert.accept();
        //   - Retrieve the name that appears on the screen UI and print it on
        //   the console, verifying that the correct name is displayed.
        WebElement printName = driver.findElement(By.id("prompt-demo"));
        System.out.println("Confirm my name: " + printName.getText());
    }
}
