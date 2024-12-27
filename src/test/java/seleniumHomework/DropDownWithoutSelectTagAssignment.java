package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithoutSelectTagAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        //1) Choose Your Dream Fruit:
        //   - Retrieve all options from the "Choose your Dream Fruit" dropdown.
        WebElement dreamFruitDD = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        dreamFruitDD.click();
        //   - Traverse through the list of options, and select **Mango**.
        List<WebElement> listOfDreamFruit = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for (WebElement selectFruit : listOfDreamFruit) {
            String fruitText = selectFruit.getText();

            if (fruitText.equals("Mango")) {
                selectFruit.click();
            }
        }
        //   - Ensure that the selection process is done by iterating through the
        //   options and not by directly clicking on the option using Xpath or any
        //   direct locator to the item.

        // 2) Choose Your Favorite Hobby:
        //   - Retrieve all options from the "Choose your Favorite Hobby" dropdown.
        WebElement favoriteHobbyDD = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        favoriteHobbyDD.click();
        //   - Traverse through the list and select **Reading**.
        List<WebElement> listOfHobbies = driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for (WebElement selectHobby : listOfHobbies) {
            String hobbyText = selectHobby.getText();

            if (hobbyText.equals("Reading")) {
                selectHobby.click();
            }
        }
        //   - Ensure that the desired option is selected by iterating through the
        //   options, not by directly clicking on it using Xpath or any other direct
        //   locator to the item.

    }
}
