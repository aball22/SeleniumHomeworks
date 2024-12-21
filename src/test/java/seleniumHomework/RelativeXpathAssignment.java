package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAssignment {

    public static void main(String[] args) {

        //Declare an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Get the webpage
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        //The user is able to enter their hobbies using XPath.
        WebElement yourHobbies = driver.findElement(By.xpath("//input[@name='yourHobbies']"));
        yourHobbies.sendKeys("Reading");
        // When the user clicks the "Click Here" button using XPath.,
        //      Then the message `"Button clicked:"` should be displayed on the screen.
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
        //The user successfully enters their favorite movie using XPath to find the text boxes.
        WebElement favoriteMovies = driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        favoriteMovies.sendKeys("The Labyrinth and Phantom of the Opera");
        //The user uses the `contains()` method of XPath to locate a specific text element
        //      on the page and prints it to the console.
        WebElement paragraphBox = driver.findElement(By.xpath("//label[contains(text(),'ipsum dolor sit amet consectetur adipisicing')]"));
        String paragraphToString = paragraphBox.getText();
        System.out.println(paragraphToString);
        //The user is able to enter the city in the designated field.
        WebElement city = driver.findElement(By.xpath("//input[@name='yourCity']"));
        city.sendKeys("Parker");
        //The user must use the **indexing technique** learned in class to enter  email addresses.
        WebElement personalEmail = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        personalEmail.sendKeys("amber@personalemail.com");
        WebElement officeEmail = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        officeEmail.sendKeys("amber@officeemail.com");
        WebElement professionalEmail = driver.findElement(By.xpath("(//input[@type='email'])[3]"));
        professionalEmail.sendKeys("amber@professionalemail.com");
        //The user must use the **operators technique**
        //      (e.g., `and`, `or`) to enter both the client name and client ID.
        WebElement clientName = driver.findElement(By.xpath("//input[@name='clientName' and @data-detail='one']"));
        clientName.sendKeys("Amber Ball");
        WebElement clientId = driver.findElement(By.xpath("//input[@name='clientId' and @data-detail='two']"));
        clientId.sendKeys("123456789");
        //The user can use **any XPath technique** to enter the street number and house number.
        WebElement streetNumber = driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNumber.sendKeys("42 Wallaby Way");
        WebElement houseNumber = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumber.sendKeys("408");

    }
}
