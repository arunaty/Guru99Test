package guruLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MngLogin {

	@FindBy(name = "uid")
	private WebElement userId;
	@FindBy(name = "password")
	private WebElement userPass;
	@FindBy(name = "btnLogin")
	private WebElement loginBtn;
	@FindBy(xpath = "//*[@class='menusubnav']/li[15]/a")
	private WebElement logoutBtn;

	public MngLogin(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void setMngLoginUserid(String uid) {
		userId.sendKeys(uid);
	}

	public void setMngLoginUserPass(String pass) {
		userPass.sendKeys(pass);
	}

	public void clickMngLoginloginBtn() {
		loginBtn.click();
	}

	public void clickMngLoginlogoutBtn() {
		logoutBtn.click();
	}

}
