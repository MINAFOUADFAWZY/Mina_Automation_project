import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class English_Language {


    public WebElement Eng_convEle(WebDriver driver)
    {
        By Eng =By.xpath("//div[@id=\"SIvCob\"]//a[@dir=\"ltr\"]");
        WebElement Eng_convEle= driver.findElement(Eng);
        return Eng_convEle;
    }
}
