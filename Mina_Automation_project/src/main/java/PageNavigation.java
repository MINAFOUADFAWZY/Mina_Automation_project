import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageNavigation {

    public WebElement Pag2_navEle(WebDriver driver)
    {
        By pg2 =By.cssSelector("a[aria-label=\"Page 2\"]");
        WebElement Pag2_navEle= driver.findElement(pg2);
        return Pag2_navEle;
    }
    public WebElement Pag3_navEle(WebDriver driver)
    {
        By pg3 =By.cssSelector("a[aria-label=\"Page 3\"]");
        WebElement Pag3_navEle= driver.findElement(pg3);
        return Pag3_navEle;
    }
}
