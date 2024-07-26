package vlr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Automation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.vlr.gg/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//a[@href='/login'])[1]")).click();
		
		driver.findElement(By.xpath("//a[@href='/auth/twitch']")).click();
		
		driver.findElement(By.id("login-username")).sendKeys("Deadpool");
		driver.findElement(By.id("password-input")).sendKeys("Wade Wilson");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.findElement(By.xpath("//button[@data-a-target='passport-login-button']")).click();
		
		System.out.println(driver.getTitle());
		
	}

}
