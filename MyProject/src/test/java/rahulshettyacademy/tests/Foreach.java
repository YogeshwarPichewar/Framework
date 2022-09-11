package rahulshettyacademy.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class Foreach {

	public static void main(String[] args) throws InterruptedException {
		String productName = "ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		LandingPage landingPage = new LandingPage(driver);
		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("b")));
			List<WebElement> products = driver.findElements(By.cssSelector("b"));
		for(WebElement e : products) {
			if(e.getText().equals(productName)){
				driver.findElement(By.cssSelector(".card-body button:last-of-type")).click();	
			}
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		//ng-animating
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		Thread.sleep(5000);
//	WebElement prod =	products.stream().filter(product->
//		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
//		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
//		
		
	
		// TODO Auto-generated method stub

	}

}
