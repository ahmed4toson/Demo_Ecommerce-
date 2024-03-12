package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    WebDriver driver ;
    @BeforeTest
    public void openurl()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.nopcommerce.com");


    }
    @AfterTest
    public void closeurl ()
    {
        driver.close();
    }
}
