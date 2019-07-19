package pagePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PagesWithFactory {
	WebDriver driver;

	public PagesWithFactory(WebDriver driver) 
{
		this.driver = driver;
	}

	@FindBy(name = "userName")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement pass;

	@FindBy(name = "login")
	@CacheLookup
	WebElement btn;

	public void login_new(String uid, String pwd) {
		username.sendKeys(uid);
		pass.sendKeys(pwd);
		btn.click();
	}

}



teat-shareyourproject
click on check box
select ur project
click creATE REPOSITORY