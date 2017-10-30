package step_definitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AmazonHomePage;
import pageobjects.BookDetails;
import pageobjects.Cart;
import cucumber.api.java.en.*;


public class Amazon{
    public WebDriver driver;  
    
    public Amazon()
    {
    	driver = Hooks.driver;
    }
    
    @Given("^I open \"(.*?)\"$")
    public void i_open(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://amazon.com");
    }

    @When("^I search for \"(.*?)\"$")
    public void i_search_for(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, AmazonHomePage.class);
    	AmazonHomePage.selectBooksCategory();
    	AmazonHomePage.searchForBook();
    }

    @When("^I open the first book$")
    public void i_open_the_first_book() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Hooks.waitForLoad(driver);
        AmazonHomePage.firstBookInResults.click();
    }

    @When("^I add the first book to shopping cart$")
    public void i_add_the_first_book_to_shopping_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, BookDetails.class);
    	Hooks.waitForLoad(driver);
        BookDetails.addToCart.click();
        Hooks.waitForLoad(driver);
        BookDetails.navigateToCartPage.click();
    }

    @Then("^I should see the book in my shopping cart$")
    public void i_should_see_the_book_in_my_shopping_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	PageFactory.initElements(driver, Cart.class);
        Cart.cartItemText.getText().contains("The lean Startup");
    }
    
}