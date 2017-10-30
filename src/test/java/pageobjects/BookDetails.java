package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookDetails extends BaseClass {

	public BookDetails(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='add-to-cart-button']")
	public static WebElement addToCart;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='nav-cart']")
	public static WebElement navigateToCartPage;
	
}
