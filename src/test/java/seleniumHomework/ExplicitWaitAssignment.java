package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // 1) **Change Text**:
        //   - Click on the button **"Click me to change text!"**.
        WebElement textButton = driver.findElement(By.xpath("//button[@id='changetext_button']"));
        textButton.click();
        //   - Wait until the text changes to **"Ssyntaxtechs"**, then print the text
        //   **"Ssyntaxtechs"** on the console.
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement textChange = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(textChange.getText());
        // 2) **Enable Button**:
        //   - Click on the button **"Click me to enable button"**.
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableButton.click();
        //   - Wait for the button to be enabled, and once it's enabled, click on it.
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement button = driver.findElement(By.xpath("//button[text()='Button']"));
        button.click();
        //Thread.sleep(2000);
        // 3) **Checkbox Checked Based on Click**:
        //   - Click on the button **"Click me to check the checkbox"**.
        WebElement checkedButton = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkedButton.click();
        //   - Wait for the checkbox to be checked, then print the status of **isSelected**
        //   on the console to verify if the checkbox is enabled.
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox, true));
        boolean statusOfCheckbox = checkbox.isSelected();
        System.out.println("The checkbox is selected: " + statusOfCheckbox);
    }
}
