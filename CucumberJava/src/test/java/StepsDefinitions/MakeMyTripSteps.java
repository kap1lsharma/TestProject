//package StepsDefinitions;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.cucumber.java.en.*;
//
//public class MakeMyTripSteps {
//
//	WebDriver driver = null;
//
//	@Given("Browser is open")
//	public void browser_is_open() {	
//		
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project Path is:" +projectPath);		
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");
//		
//
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(co);		 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		
//        driver.manage().window().maximize(); 
//	}
// 
//	@And("User is on google search page")
//	public void user_is_on_google_search_page() {
//		
//		driver.get("https://www.google.com/");
//	}
//
//	@When("User Enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException
//	{		
//		driver.findElement(By.name("q")).sendKeys("Make My Trip");
//		Thread.sleep(2000);;
//	}
//
//	@And("Hits enter")
//	public void hits_enter() throws InterruptedException {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//
//	}
//
//	@Then("User is navigated to Seach result")
//	public void user_is_navigated_to_seach_result() {
//		driver.getPageSource().contains("Train Ticket Booking");
//		driver.close();
//		driver.quit();
//	}
//}
