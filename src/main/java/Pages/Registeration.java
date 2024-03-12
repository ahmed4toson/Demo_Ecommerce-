package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registeration {

    WebDriver driver ;

    private final By Genader = new By.ById("gender-male");
    private final By First_name = new By.ById("FirstName");
    private final By Last_name = new By.ById("LastName");
    private  final By dayofBirth = new By.ByXPath("//select[@name='DateOfBirthDay']");
    private final By chooseday = new By.ByXPath("//option[@value='29']");
    private  final By monthofBirth =new By.ByXPath("//select[@name='DateOfBirthMonth']");
    private final By choosemonth = new By.ByXPath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[7]");
    private  final By yearsofBirth =new By.ByXPath("//select[@name='DateOfBirthYear']");
    private final By chooseyears = new By.ByXPath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[85]");
    private final By email = new By.ByName("Email");
    private final By Password = new By.ByXPath("//input[@id='Password']");
    private final By Confirm_Password = new By.ByXPath("//input[@id='ConfirmPassword']");
    private final By Button_registeration = new By.ById("register-button");

    public Registeration (WebDriver driver)
    {
      this.driver = driver ;

    }

    public void fill_form (String F_name , String L_name, String enteremail,String enterPassword ,String enterconfirmpassword )
    {

      driver.findElement(Genader).click();
      driver.findElement(First_name).sendKeys(F_name);
      driver.findElement(Last_name).sendKeys(L_name);
      driver.findElement(dayofBirth).click();
      driver.findElement(chooseday).click();
      driver.findElement(monthofBirth).click();
      driver.findElement(choosemonth).click();
      driver.findElement(yearsofBirth).click();
      driver.findElement(chooseyears).click();
      driver.findElement(email).sendKeys(enteremail);
      driver.findElement(Password).sendKeys(enterPassword);
      driver.findElement(Confirm_Password).sendKeys(enterconfirmpassword);
      driver.findElement(Button_registeration).click();

    }




}
