package Test;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Register_Test extends TestBase {

    Homepage homepage;
    Registeration registeration;
    Loginpage loginpage;
    Wishlist wishlist;
    Checkout checkout ;
    Detailscheckout detailscheckout ;

    @Test(priority = 1)

    public void Registersuccessfully() {
        homepage = new Homepage(driver);
        homepage.navigate_to_Register();

        registeration = new Registeration(driver);
        registeration.fill_form("Ahmed", "Mohamed", "ahmed4toson@gmail.com", "Aa123456", "Aa123456");
        homepage.navigate_to_Login();

    }


    @Test(priority = 2)
    public void trylogin() {

        loginpage = new Loginpage(driver);
        loginpage.login("ahmed4toson@gmail.com", "Aa123456");

    }


    @Test(priority = 3)
    public void checkout_theproduct() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.search_Product("Apple MacBook Pro 13-inch");
        wishlist= new Wishlist(driver);
        wishlist.addwishlist();
        
    }

    @Test (priority = 4)
    public void enter_checkout () throws InterruptedException {
      checkout = new Checkout(driver);
      checkout.checoutlist("wakeb","egybt" ,"cairo","alexindria" ,"12345","01212171824" ,"151515");

    }
    @Test (priority = 5)
    public void Contiune_checkout ()
    {
        detailscheckout = new Detailscheckout(driver);
        detailscheckout.Contiunedetails();
    }


}