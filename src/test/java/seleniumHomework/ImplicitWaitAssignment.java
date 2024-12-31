package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 1) **Button Click and Checkbox Selection**:
        //   - Click on the button labeled **"Click me"**.
        WebElement button = driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        button.click();
        //   - Use an appropriate wait method to wait until the checkbox options appear.
        //   - Once the checkboxes are visible, select **Option 1** from the list of checkboxes.
        WebElement option1 = driver.findElement(By.xpath("//input[@value='Option-1']"));
        option1.click();
    }
}
