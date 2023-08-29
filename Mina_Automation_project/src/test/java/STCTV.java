import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class STCTV {



    WebDriver driver =null ;

    @BeforeTest
    public void openBrowser() throws InterruptedException {

        String chrompath =System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chrompath);
        System.setProperty("webdriver.chrome.silentOutput", "true");
        ChromeOptions Options= new ChromeOptions();
        Options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(Options);

        driver.navigate().to("https://www.google.com"); //Navigation to Google
        driver.manage().window().maximize();
        Thread.sleep(5000);



    }
      GoogleSearch sea =new GoogleSearch();
    NumberValidation Num =new NumberValidation();
    PageNavigation page2 = new PageNavigation();
    PageNavigation page3 = new PageNavigation();
    DifferentSearchSug Diff = new DifferentSearchSug();

    English_Language Eng = new English_Language();
    SoftAssert soft =new SoftAssert();


    @Test
    public void Subscribe_KSA() throws InterruptedException {

        Eng.Eng_convEle(driver).click();// convert google to English language
        Thread.sleep(5000);
        sea.searchEle(driver).sendKeys("estb"); // Enter estb in the search bar
        sea.searchEle(driver).sendKeys(Keys.ENTER); // Navigate to estb pages
        sea.searchEle(driver).clear();  //Clear estb from the search bar
        sea.searchEle(driver).sendKeys("ISTQB"); // Enter ISTQB in the search bar
        sea.searchEle(driver).sendKeys(Keys.ENTER); // Navigate to ISTQB pages
        String expected_result1 = "About";
        String Actual_result1 = Num.Num_valEle(driver).getText();
        soft.assertTrue(Actual_result1.contains(expected_result1),"Number of results exists successfully"); // Validate the number of search at the top of the page
        Thread.sleep(5000);
        page2.Pag2_navEle(driver).click(); // Navigate to page 2
        String Actual_result2 = Num.Num_valEle(driver).getText();
        Thread.sleep(5000);
        page3.Pag3_navEle(driver).click(); // Navigate to page 3
        String Actual_result3 = Num.Num_valEle(driver).getText();
        String part1 = Actual_result2.substring(16,24);//Get only the numbers of search in page 2
        String  part2 = Actual_result3.substring(16,24);// Get only the numbers of search in page 3
        soft.assertEquals(part1,part2,"not equal");
        Thread.sleep(5000);
        String expected_result4="Related searches";
        String Actual_result4=Diff.Diff_sugEle(driver).getText();
        soft.assertTrue(Actual_result4.contains(expected_result4)); // Validate the prescence of another search suggestion

        soft.assertAll();





    }



   @AfterTest
    public void closedriver() throws InterruptedException {

        Thread.sleep(10000);

        driver.close();
    }


}
