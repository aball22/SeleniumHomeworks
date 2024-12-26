package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDownAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        //1) Select List Demo:
        WebElement favoriteFruit = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select selectFruit = new Select(favoriteFruit);
        //   - Use the **Select** class to select the option **"Pear"** from the dropdown.
        selectFruit.selectByValue("Pear");
        //   - You can use any method from the **Select** class (e.g., `selectByVisibleText`,
        //   `selectByValue`, `selectByIndex`).
        //   - Use the **getAllOptions** method to retrieve all options from the dropdown and
        //   print them on the console.
        List<WebElement> allOptions = selectFruit.getOptions();
        for (WebElement printOptions : allOptions) {
            System.out.println(printOptions.getText());
        }

        //2) Select Multiple Options:
        WebElement favoriteHobbies = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selectHobby = new Select(favoriteHobbies);
        //   - First, verify that the **Select** dropdown is multi-select by checking the
        //   dropdown’s properties.
        boolean multiDD = selectHobby.isMultiple();
        System.out.println("The dropdown is multi-select: " + multiDD);
        //   - Using the **Select** class, make the following selections:
        //     - **Traveling**
        selectHobby.selectByIndex(1);
        //     - **Cooking**
        selectHobby.selectByValue("Cooking");
        //     - **Gardening**
        selectHobby.selectByVisibleText("Gardening");
        //   - Click the **"Get All Selected"** button and print the result on the console.
        WebElement getAllButton = driver.findElement(By.xpath("//button[@id='get_all']"));
        getAllButton.click();
        List<WebElement> selectedOptions = selectHobby.getAllSelectedOptions();
        System.out.println("You selected:");
        for (WebElement printSelected : selectedOptions) {
            System.out.println(printSelected.getText());
        }
        //   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
        Thread.sleep(5000);
        selectHobby.deselectByVisibleText("Traveling");
        //   - Click the **"Get All Selected"** button again and print the result on the console.
        getAllButton.click();
        List<WebElement> updatedSelectedOptions = selectHobby.getAllSelectedOptions();
        System.out.println("You selected:");
        for (WebElement updatePrintSelected : updatedSelectedOptions) {
            System.out.println(updatePrintSelected.getText());
        }

    }
}
