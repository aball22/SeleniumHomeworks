package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAssignment {
    public static void main(String[] args) {

        // 1) Declare the instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // 2) Maximize the window
        driver.manage().window().maximize();
        // 3) Get the website https://syntaxprojects.com/cssSelector-homework.php
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");
        // 4) User ID
        WebElement userId = driver.findElement(By.cssSelector("input#UserID"));
        userId.sendKeys("123456789");
        // 5) User Name
        WebElement userName = driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("Moazzam");
        // 6) Intro to Lecture
        WebElement introToLecture = driver.findElement(By.cssSelector("input[data-starts^='intro']"));
        introToLecture.sendKeys("Intro to WebDriver");
        // 7) Feedback from Ray
        WebElement feedbackFromRay = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackFromRay.sendKeys("Selenium is so fun!!!");
        // 8) Feedback from Ducky
        WebElement feedbackFromDucky = driver.findElement(By.cssSelector("input[id*='Ducky']"));
        feedbackFromDucky.sendKeys("This instructor is awesome!!!");
        // 9) Client ID
        WebElement clientId = driver.findElement(By.cssSelector("input[name$='ID']"));
        clientId.sendKeys("Syntax Practice");
        // 10) Email
        WebElement email = driver.findElement(By.cssSelector("input[name*='mail']"));
        email.sendKeys("syntaxstudent@syntax.com");
        // 11) Course Topic
        WebElement courseTopic = driver.findElement(By.cssSelector("input[data-content*='intermediate']"));
        courseTopic.sendKeys("CSS Selector");
    }
}
