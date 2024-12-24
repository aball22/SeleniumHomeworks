package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonsAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        // 1) Choose Your Favorite Beverage:
        //   - Select the Juice radio button from the list of favorite beverages.
        WebElement favoriteBeverage = driver.findElement(By.xpath("//input[@value='Juice']"));
        favoriteBeverage.click();
        // 2) Preferred Working Environment:
        //   - Retrieve all radio buttons in the Preferred Working Environment section.
        List<WebElement> workingEnvironment = driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        //   - Traverse through the list of radio buttons in code and select the Hybrid option.
        for (WebElement environment : workingEnvironment) {
            if (environment.getAttribute("value").equals("hybrid")) {
                environment.click();
            }
        }
        // 3) Choose Your Favorite Season:
        WebElement spring = driver.findElement(By.xpath("//input[@value='spring']"));
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        //   - If the Spring radio button is disabled, click on the "Enable Buttons" button.
        boolean stateOfSpring = spring.isEnabled();
        if (!stateOfSpring) {
            enableButton.click();
        }
        //   - Ensure that the Spring option is now enabled, then select it.
        stateOfSpring = spring.isEnabled();
        System.out.println("The Spring Option is enabled: " + stateOfSpring);
        spring.click();
        //   - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
        WebElement winter = driver.findElement(By.xpath("//input[@value='winter']"));
        WebElement showButtons = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        boolean displayStateOfWinter = winter.isDisplayed();
        System.out.println("The Winter Option is displayed: " + displayStateOfWinter);
        if (!displayStateOfWinter) {
            showButtons.click();
        }
        //   - Verify that the Winter option is displayed after clicking and is available for selection.
        displayStateOfWinter = winter.isDisplayed();
        System.out.println("The Winter Option is displayed: " + displayStateOfWinter);
        //4) Choose Your Favorite Meal:
        //   - Select the Lunch radio button from the list of favorite meals.
        List<WebElement> favoriteMeal = driver.findElements(By.xpath("//input[@name='meal']"));
        for (WebElement meal : favoriteMeal) {
            if (meal.getAttribute("value").equals("lunch")) {
                meal.click();
            }
        }
    }
}
