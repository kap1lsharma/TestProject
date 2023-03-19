//package pages;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//public class LoginPage {
//
//	protected WebDriver driver;
//
//	private By txt_username = By.id("name");
//
//	private By txt_password = By.id("password");
//
//	private By btn_login = By.id("login");
//
//	private By btn_Logout = By.id("logout");
//
//	public LoginPage(WebDriver driver) {
//
//		this.driver = driver;
//		
//		if(!driver.getTitle().equals("TestProject Demo")){
//			
//			throw new  IllegalStateException("This is not a Login Page. The current page is:" +driver.getCurrentUrl());
//		}
//	}
//
//	public void enterUsername(String username) throws InterruptedException  {
//
//		driver.findElement(txt_username).sendKeys(username);
//		Thread.sleep(2000);
//	}
//
//	public void enterPassword(String password) throws InterruptedException  {
//
//		driver.findElement(txt_password).sendKeys(password);
//		Thread.sleep(2000);
//	}
//
//	public void clickLogin() throws InterruptedException  {
//		driver.findElement(btn_login).click();
//		Thread.sleep(2000);		
//	}
//
//	public void checkLogOutIsDisplayed() {
//
//		driver.findElement(btn_Logout).isDisplayed();
//		driver.close();
//		driver.quit();
//		
//	}
//
//}
