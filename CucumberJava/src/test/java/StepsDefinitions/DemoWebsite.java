																																												//package StepsDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.*;
//
//public class DemoWebsite {
//
//	WebDriver driver = null;
//
//	@Given("Browser is open")
//	public void browser_is_open() {
//
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project Path is:" + projectPath);
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver/chromedriver.exe");
//
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(co);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//
//		driver.manage().window().maximize();
//	}
//
//	@And("User is on Login Page")
//	public void user_is_on_login_page() throws InterruptedException {
//
//		driver.navigate().to("https://example.testproject.io/web/");
//		Thread.sleep(2000);
//
//	}
//
//	@When("^User enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password)  {
//
//		driver.findElement(By.id("name")).sendKeys(username);
//
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@And("User clicks on Login")
//	public void user_clicks_on_login() throws InterruptedException {
//
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
//
//	}
//
//	@Then("User is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		
//		driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(2000);
//		
//		driver.close();
//		driver.quit();
//
//	}
//
//}
////Ctrl shift F
