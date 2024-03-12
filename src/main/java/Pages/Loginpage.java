package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 public class Loginpage {
    WebDriver driver;

    private final By Email = new By.ByXPath("//input[@class='email']");
    private final By Password = new By.ByXPath("//input[@id='Password']");
    private final By Buttonlogin =new By.ByCssSelector("button.button-1.login-button");

    public Loginpage (WebDriver driver)

    {
      this.driver = driver ;
    }
     public void login (String username , String password )
    {
    driver.findElement(Email).sendKeys(username);
    driver.findElement(Password).sendKeys(password);
   driver.findElement(Buttonlogin).click();
    }


}
