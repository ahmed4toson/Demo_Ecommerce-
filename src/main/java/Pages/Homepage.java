package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    WebDriver driver;

    private final By RegisterButton =new By.ByClassName("ico-register");
    private final By loginButton  = new By.ByClassName("ico-login");
    private final By SearchBar = new By.ByCssSelector("input.search-box-text.ui-autocomplete-input");
    private final By searchButton = new By.ByXPath("//*[@id=\"small-search-box-form\"]/button");



    public Homepage (WebDriver driver)
    {
        this.driver = driver;
    }
    public void navigate_to_Register ()
    {
        driver.findElement(RegisterButton).click();
    }
    public void navigate_to_Login ()
    {
        driver.findElement(loginButton).click();
    }

    public void search_Product (String search) throws InterruptedException {
        driver.findElement(SearchBar).sendKeys(search);
        driver.findElement(searchButton).click();
        Thread.sleep(300);

    }
}
