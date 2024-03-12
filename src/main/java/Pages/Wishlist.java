package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wishlist {
    WebDriver driver ;

   private final By Add_to_cart =new By.ByCssSelector("button.button-2.product-box-add-to-cart-button");
   private final By Add_to_cart2 = new By.ByCssSelector("button.button-1.add-to-cart-button");
   private final By shopping_cart = new By.ByCssSelector("span.cart-label");
   private final By Agree_terms = new By.ById("termsofservice");
   private final By Checkout = new By.ByCssSelector("button.button-1.checkout-button");


    public Wishlist (WebDriver driver)
    {
        this.driver =driver ;
    }


 public void addwishlist () throws InterruptedException {
     driver.findElement(Add_to_cart).click();
     Thread.sleep(1000);
     driver.findElement(Add_to_cart2).click();
    // driver.findElement(Click_on_WishList).click();
     driver.findElement(shopping_cart).click();
     driver.findElement(Agree_terms).click();
     driver.findElement(Checkout).click();
 }



}
