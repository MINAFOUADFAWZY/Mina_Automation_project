import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NumberValidation {

    public WebElement Num_valEle(WebDriver driver)
    {
        By Num_val =By.id("result-stats");
        WebElement Num_valEle= driver.findElement(Num_val);
        return Num_valEle;
    }

}
