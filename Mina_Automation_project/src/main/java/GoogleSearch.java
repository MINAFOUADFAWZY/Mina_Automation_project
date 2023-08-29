import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

    public WebElement searchEle(WebDriver driver)
    {
        By search =By.id("APjFqb");
        WebElement searchEle= driver.findElement(search);
        return searchEle;
    }

}
