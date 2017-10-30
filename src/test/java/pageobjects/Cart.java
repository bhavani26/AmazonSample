package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cart extends BaseClass {

	public Cart(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span")
	public static WebElement cartItemText;
	
}
