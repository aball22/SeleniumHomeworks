package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsAssignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        // 1) Retrieve Attribute:
        //   - Retrieve the text "inspect me to view my custom attribute" from the element
        //   and print it on the console, ensuring the text is correct.
        WebElement retrieveAttribute = driver.findElement(By.xpath("//div[@id='textattr']"));
        String attributeText = retrieveAttribute.getText();
        System.out.println("The retrieved text is: " + attributeText);
        // 2) Meal Preference:
        //   - Choose the checkbox for the meal preference "Musical Festival," ensuring the
        //   checkbox is enabled before clicking on it.
        WebElement rb1 = driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean stateOfRb1 = rb1.isEnabled();
        System.out.println("The Music Festival radio button is enabled: " + stateOfRb1);
        rb1.click();
        //   - Ensure that the option for "Tech Talk" is disabled.
        WebElement rb2 = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean stateOfRb2 = rb2.isEnabled();
        System.out.println("The Tech Talk radio button is enabled: " + stateOfRb2);
        //   - Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.
        WebElement showMoreOptions = driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        showMoreOptions.click();
        boolean displayStateOfShowMore = showMoreOptions.isDisplayed();
        if (displayStateOfShowMore) {
            System.out.println("The Art Exhibition Option is displayed");
        } else {
            System.out.println("The Art Exhibition Option is not displayed");
        }
        // 3) Mystery Message:
        //   - Retrieve the value of the attribute `title` from the element containing the
        //   text "Hover me to reveal the secret" and print it on the console.\
        WebElement attributeValue = driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String titleValue = attributeValue.getAttribute("title");
        System.out.println("The secret text is: " + titleValue);
        // 4) Option Box:
        //   - If "Checkbox 1" is enabled, click on it.
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean stateOfCheckBox1 = checkBox1.isEnabled();
        System.out.println("Check Box 1 is enabled: " + stateOfCheckBox1);
        checkBox1.click();
        //   - Ensure that "Checkbox 2" is disabled.---
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        boolean stateOfCheckBox2 = checkBox2.isEnabled();
        System.out.println("Check Box 2 is enabled: " + stateOfCheckBox2);
        // 5) Input Field:
        //   - clear the text in the input box and send the text "here is the custom text
        //   entered" using selenium commands.
        WebElement inputField = driver.findElement(By.xpath("//input[@name='inputField']"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered");
    }
}
