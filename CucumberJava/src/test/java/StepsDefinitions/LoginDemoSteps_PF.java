																																												package StepsDefinitions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.*;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;

public class LoginDemoSteps_PF {

	WebDriver driver;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("Browser is open")
	public void browser_is_open() {
		
		System.out.println("I am inside LoginDemoSteps_PF");

//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project Path is:" + projectPath);
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.manage().window().maximize();
	}

	@And("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {

		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(2000);

	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		
		login.enterUsername(username);
		Thread.sleep(2000);

		login.enterPassword(password);
		Thread.sleep(2000);


		
	//	driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("User clicks on Login")
	public void user_clicks_on_login() throws InterruptedException {

		
		login.clickLogin();
//		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);

	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		
		home.checkLogoutIsDisplayed();
		
//		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}

}
//Ctrl shift F
