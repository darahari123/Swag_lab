package Org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_defination {
	WebDriver driver;

@Given("user should be in swaglab application")
public void user_should_be_in_swaglab_application() {
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
   
}
@When("user enters valid username and password")
public void user_enters_valid_username_and_password() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    
}
@When("click on login button")
public void click_on_login_button() {
	driver.findElement(By.id("login-button")).click();
   
}
@Then("user enters in to home page of swaglab application")
public void user_enters_in_to_home_page_of_swaglab_application() {
    System.out.println("landed in home page of SWAG LABS ");
}


@When("user select low to high prizes of products")
public void user_select_low_to_high_prizes_of_products() {
  Select sale = new Select(driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]"))); 
	sale.selectByValue("lohi");
}

@When("user adds the product to the cart by clicking on Add to cart")
public void user_adds_the_product_to_the_cart_by_clicking_on_add_to_cart() {
   driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
}
@When("user clicks on the cart symbol to enter details and pay the bill")
public void user_clicks_on_the_cart_symbol_to_enter_details_and_pay_the_bill() throws InterruptedException {
	Thread.sleep(5000);
  driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
}
@When("click on checkout button")
public void click_on_checkout_button() {
   driver.findElement(By.id("checkout")).click();
}
@When("confirmation of checkout page")
public void confirmation_of_checkout_page() {
    System.out.println("we will see your information page here");
}
@When("enter details of userbname")
public void enter_details_of_userbname() {
   driver.findElement(By.id("first-name")).sendKeys("krishna raja");
   driver.findElement(By.id("last-name")).sendKeys("rama raja");
	driver.findElement(By.id("postal-code")).sendKeys("518005");
}
@When("click on conbtinue")
public void click_on_conbtinue() {
	driver.findElement(By.id("continue")).click();
}
@When("click on finish to order the product")
public void click_on_finish_to_order_the_product() {
   driver.findElement(By.id("finish")).click();
}
@When("click on backhome button to go to home page")
public void click_on_backhome_button_to_go_to_home_page() {
	driver.findElement(By.id("back-to-products")).click();
   
}
@When("click on logout button to exit from application")
public void click_on_logout_button_to_exit_from_application() {
	driver.findElement(By.id("react-burger-menu-btn")).click();
	driver.findElement(By.id("logout_sidebar_link")).click();
	

}
}
