package guruLoginTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import guruBase.Baseguru;
import guruLogin.MngLogin;
import guruLogin.MngLoginVerify;

public class MngLoginTest extends Baseguru {
	MngLogin Login;
	MngLoginVerify Verify;

	@BeforeClass
	public void openBrowser() {
		invokebrowser();
		// create object of Login class
		Login = new MngLogin(driver);
		Verify = new MngLoginVerify(driver);
	}

	@BeforeMethod
	public void openLink() {
		driver.get("https://demo.guru99.com/V4/index.php");

	}

	@Test(dataProvider = "userpass")
	public void login(String user, String pwd) {

		Login.setMngLoginUserid(user);
		Login.setMngLoginUserPass(pwd);
		Login.clickMngLoginloginBtn();
		String actUserid = Verify.getUseridWeb();
		Assert.assertEquals(user, actUserid, "The Userid match");

	}

	@AfterMethod
	public void logoutApp() {
		Login.clickMngLoginlogoutBtn();
		driver.switchTo().alert().accept();
	}
	@AfterTest
	public void closebrowser(){
		
		driver.close();
	}

	@DataProvider(name = "userpass")
	public String[][] senddata() {

		String[][] usernpwd = { { "mngr460555", "YnagudE" }, { "mngr460556", "YnaqYgY" }, { "mngr460557", "mynyquv" },
				{ "mngr460559", "zUdenUq" } };
		return usernpwd;

	}

}
