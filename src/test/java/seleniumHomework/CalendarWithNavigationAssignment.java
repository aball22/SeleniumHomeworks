package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarWithNavigationAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 1) **Select "From" and "To" Dates**:
        //   - Select the **From** date and the **To** date in the jQuery date picker.
        //   - The code logic should be **dynamic**, meaning it should work with any
        //   selected dates without requiring any changes to the core logic.
        //   - The selection should not rely on hard-coded date values and should be
        //   adaptable if the date range changes.

        //from date
        WebElement fromDates = driver.findElement(By.xpath("//input[@id='from_date']"));
        fromDates.click();

        WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String getMonth = month.getText();

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));

        boolean notMonth = true;
        while (notMonth) {
            if (getMonth.equals("April")) {
                List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : dates) {
                    String currentDate = date.getText();
                    if (currentDate.equals("22")) {
                        date.click();
                        notMonth = false;
                        break;
                    }
                }
            } else {
                nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
                nextButton.click();
                month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
                getMonth = month.getText();
            }
        }
        //from date
        WebElement toDates = driver.findElement(By.xpath("//input[@id='to_date']"));
        toDates.click();

        month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        getMonth = month.getText();

        notMonth = true;
        while (notMonth) {
            if (getMonth.equals("June")) {
                List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : dates) {
                    String currentDate = date.getText();
                    if (currentDate.equals("3")) {
                        date.click();
                        notMonth = false;
                        break;
                    }
                }
            } else {
                nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
                nextButton.click();
                month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
                getMonth = month.getText();
            }
        }
    }
}
