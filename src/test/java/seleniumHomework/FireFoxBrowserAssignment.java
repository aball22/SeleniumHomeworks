package seleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserAssignment {
    public static void main(String[] args) {
        /*
        User Story
        1) Title: Verify page title and URL of Syntax Projects
        2) As a user: I want to navigate to 'https://www.syntaxprojects.com/'
        3) Verify the page title and URL to ensure I am on the correct site

        Acceptance Criteria
        1. The user should be able to launch a web browser and navigate to the URL
        `https://www.syntaxprojects.com/`.
        2. The user should be able to maximize the browser window
        3. The current URL should be printed on the console and match `https://www.syntaxprojects.com/`.
        4. The page title retrieved should be printed on the console and match
        `Syntax - Website to practice Syntax Automation Platform`.
        5. The browser should close automatically after retrieving both the URL and title.
         */
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/");

        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        String title = driver.getTitle();
        System.out.println(title);

        driver.close();;

    }
}
