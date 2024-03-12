package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Detailscheckout {
    WebDriver driver ;


    private final By Continueshipping1 =new By.ByXPath("//*[@id=\"billing-buttons-container\"]/button[4]");
   private final By Continuepayment =new By.ByXPath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button"); //contiune
   private final By Continueinformation =new By.ByCssSelector("button.button-1.payment-info-next-step-button");








    public Detailscheckout (WebDriver driver)
    {
        this.driver= driver ;
    }

    public void Contiunedetails ()
    {

       driver.findElement(Continueshipping1).click();

        WebElement element = driver.findElement(Continuepayment);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    driver.findElement(Continueinformation).click();

    }
}
