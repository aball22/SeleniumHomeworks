package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToLocatorsAssignment {
    public static void main(String[] args) {
        /*
        User Story
- Title:Form Submission Using Locators
- As a user,
- I want to fill out and submit a form on `https://www.syntaxprojects.com/locator-homework.php` using different locators
- So that I can verify that the form is submitted successfully and displays the entered information.

Acceptance Criteria
1. The user should fill the form using any of the locators (`id`, `name`, `tagname`, `linktext`, `partial linktext`).
2. If the email address is not in the correct format (i.e., it doesn't contain an `@` sign), the form should not be submitted, and an error message should be displayed.
3. When the user clicks on the "Click Here" link, a new tab should open in the browser.
4. When the user clicks the "Submit" button, all the entered options should be displayed on the screen.
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("Stan Smith");

        WebElement email = driver.findElement(By.name("yourEmail"));
        email.sendKeys("stan_smith@selenium.com");

        String emailValue = email.getAttribute("value");
        if (!emailValue.contains("@")) {
            System.out.println("Error: Email must include '@'");
            driver.quit();
            return;}

        WebElement clientName = driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Jesse James");

        WebElement clientID = driver.findElement(By.name("ClientId"));
        clientID.sendKeys("123456789");

        WebElement clientFeedback = driver.findElement(By.name("Clientfeedback"));
        clientFeedback.sendKeys("Selenium Rocks!");

        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Locators Project");

        WebElement projectDeadline = driver.findElement(By.name("ProjectTime"));
        projectDeadline.sendKeys("02/02/2022");

        WebElement currentAddress = driver.findElement(By.tagName("textarea"));
        currentAddress.sendKeys("42 Wallaby Way");

        WebElement permanentAddress = driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("57 Developers Lane");

        WebElement clickLink = driver.findElement(By.partialLinkText("Here."));
        clickLink.click();

        WebElement submitButton = driver.findElement(By.className("btn btn-primary"));
        submitButton.click();

    }
}