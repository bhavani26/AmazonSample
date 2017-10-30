package pageobjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage extends BaseClass {

	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.ID, using = "searchDropdownBox")
	public static WebElement searchCategoryDropDown;

	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	public static WebElement searchTextBox;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='nav-search']/form/div[2]/div/input")
	public static WebElement submit;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a")
	public static WebElement firstBookInResults;
	
	
	
	public static void selectBooksCategory()
	{
		searchCategoryDropDown.sendKeys("Books");
	}
	public static void searchForBook()
	{
		searchTextBox.sendKeys("The lean Startup");
		submit.click();
	}
	public static void openTheBook()
	{
		firstBookInResults.click();
	}
}
