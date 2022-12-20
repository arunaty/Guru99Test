package guruBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseguru {

	public WebDriver driver;

	public void invokebrowser() {
		// invoke browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lakha\\eclipse\\Fresh-eclipse-workspace\\Guru99banking\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
