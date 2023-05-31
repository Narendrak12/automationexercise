package PageObjectsclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automationexercise.Uilities.Keywordsfunctions;
import com.automationexercise.base.BaseClass;

public class Homepage extends BaseClass

{
	Keywordsfunctions keyword = new Keywordsfunctions();
	@FindBy(xpath = "//i[@class='fa fa-home']")
	WebElement Homepageelment;

	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement signuploginbutton;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public void checkhomepage() {
		keyword.clickWebelment(driver, Homepageelment);
		String source = keyword.getElementtext(Homepageelment);
		Assert.assertEquals(source, "EHome");

	}

	public void clickonsignbutton() {
		keyword.clickWebelment(driver, Homepageelment);
	}

	public void verifyTitle() {

	}

}
