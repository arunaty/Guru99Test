package guruLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MngLoginVerify {

	@FindBy(xpath = "(//table[@align='center'])[2]/tbody/tr[3]/td")
	private WebElement loggedUsrnm;

	public MngLoginVerify(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public String getUseridWeb() {

		String usernm = loggedUsrnm.getText().split(":")[1].trim();
		return usernm;
	}

}
