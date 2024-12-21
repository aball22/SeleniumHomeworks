package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathAssignment {
    public static void main(String[] args) {
        // 1) Declare the instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // 2) Maximize the window
        driver.manage().window().maximize();
        // 3) Get the website https://syntaxprojects.com/advanceXpath-homework.php
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");
        // 4) The user should enter the names of books in reverse order from least
        //      favorite to favorite using advanced Xpath (such as `parent`,
        //      `following-sibling`, or `preceding-sibling`)
        WebElement leastFavorite = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastFavorite.sendKeys("Nueromancer");
        WebElement middleFavorite = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        middleFavorite.sendKeys("My Sweet Audrina");
        WebElement mostFavorite = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        mostFavorite.sendKeys("The heart shaped box");
        // 5) The user should enter the name of their favorite book using advanced Xpath.
        WebElement favoriteBook1 = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favoriteBook1.sendKeys("Until the World Falls Down");
        WebElement favoriteBook2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favoriteBook2.sendKeys("The Shining");
        WebElement favoriteBook3 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favoriteBook3.sendKeys("Twilight");
        // 6) The user should enter the names of grandparent, parent, and child fields
        //      using advanced Xpath.
        WebElement grandparent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparent.sendKeys("Grandparent");
        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Parent");
        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Child");
        // 7) The form should submit successfully only if all fields are filled out
        //      correctly using the appropriate advanced Xpath expressions.(to be removed)
    }
}
