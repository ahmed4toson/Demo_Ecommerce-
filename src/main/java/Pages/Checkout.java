package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
    WebDriver driver;
    private final By Company = new By.ByXPath("//input[@name='BillingNewAddress.Company']");
    private final By Country = new By.ByXPath("//*[@id=\"BillingNewAddress_CountryId\"]/option[66]");
    private final By City = new By.ByXPath("//*[@id=\"BillingNewAddress_City\"]");
    private final By Address1 = new By.ByXPath("//*[@id=\"BillingNewAddress_Address1\"]");
    private final By Address2 = new By.ByXPath("//*[@id=\"BillingNewAddress_Address2\"]");
    private final By Zippostalcode =new By.ByXPath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]");
    private final By Phonenumber = new By.ByXPath("//*[@id=\"BillingNewAddress_PhoneNumber\"]");
    private final By Faxnumber = new By.ByXPath("//*[@id=\"BillingNewAddress_FaxNumber\"]");
    private final By Continue = new By.ByCssSelector("button.button-1.new-address-next-step-button");  //f contiune
    private final By checkbox =new By.ByXPath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[1]/div/div/ul/li[2]/div[1]/input");


    public Checkout (WebDriver driver)
    {
     this.driver=driver;
    }

    public void checoutlist (String companyname ,String entercity , String enteraddress1 , String enteraddress2 , String enterzipcode , String enterphone ,String enterfax) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(Company).sendKeys(companyname);
        driver.findElement(Country).click();
        driver.findElement(City).sendKeys(entercity);
        driver.findElement(Address1).sendKeys(enteraddress1);
        driver.findElement(Address2).sendKeys(enteraddress2);
        driver.findElement(Zippostalcode).sendKeys(enterzipcode);
        driver.findElement(Phonenumber).sendKeys(enterphone);
        driver.findElement(Faxnumber).sendKeys(enterfax);
        driver.findElement(Continue).click();
       // driver.findElement(checkbox).click();

    }

}
