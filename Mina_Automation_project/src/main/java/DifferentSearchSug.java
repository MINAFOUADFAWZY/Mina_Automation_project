import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DifferentSearchSug {

    public WebElement Diff_sugEle(WebDriver driver)
    {
        By Diff =By.className("mgAbYb");
        WebElement Diff_sugEle= driver.findElement(Diff);
        return Diff_sugEle;
    }
}
