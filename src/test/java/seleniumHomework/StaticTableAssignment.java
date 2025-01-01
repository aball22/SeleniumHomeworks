package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTableAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");
        driver.manage().window().maximize();

        // 1)**Print All Entries with the Country "USA"**:
        String findCountry = "USA";
        List<WebElement> countries = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        //   - Dynamically search the table for entries where the country is **"USA"**.
        int count = 1;
        for (WebElement country : countries) {
            String countryValue = country.getText();
            if (countryValue.equals(findCountry)) {
                WebElement countryRow = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(countryRow.getText());
            }
            count++;
        }
        //   - Print all the rows matching criteria
        // 2) **Dynamic Logic**:
        //   - Ensure the search and filtering logic is **dynamic** and does not rely on hard-coded xpaths.
        //   - The code should be flexible enough to accommodate changes in the country name
        //   - If the country name changes (e.g., from "USA" to "Canada"), the same logic should still work,
        //   and the output should reflect the correct entries based on the updated country.
    }
}
