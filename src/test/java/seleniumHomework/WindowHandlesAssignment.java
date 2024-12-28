package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlesAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        String mainPageWH = driver.getWindowHandle();
        WebElement b1Page = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        b1Page.click();

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            System.out.println("The current window is: " + url);
            if (url.equals("https://syntaxprojects.com/b1-page.php")) {
                WebElement b1Text = driver.findElement(By.xpath("//h2[text()='Welcome to B1! page']"));
                System.out.println("The text on window B1 is: " + b1Text.getText());
                break;
            }
        }
        driver.switchTo().window(mainPageWH);
        WebElement b2Page = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        b2Page.click();

        allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            System.out.println("The current window is: " + url);
            if (url.equals("https://syntaxprojects.com/b2-page.php")) {
                WebElement b1Text = driver.findElement(By.xpath("//h2[text()='Welcome to B2 page']"));
                System.out.println("The text on window B2 is: " + b1Text.getText());
                break;
            }
        }
        // 1) Click on Button B1:
        //   - Ensure that clicking on the **B1** button opens a new window.
        //   - Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"**.
        // 2) Click on Button B2:
        //   - Ensure that clicking on the **B2** button opens a new window.
        //   - Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"**.
    }
}
