import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEC {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://evadoc.tijuana.tecnm.mx/index.php?fbclid=IwAR2UUzR1guVy749lyzJRDlRmX2fIHi7S0NJx1WuCRLr0sME06AdX9w4PnBA");
		
		
		driver.findElement(By.id("usuario3")).sendKeys("19212443");
		
		driver.findElement(By.id("pass3")).sendKeys("holahola");
		
		driver.findElement(By.id("entra3")).click();
		
		List<WebElement> teachers = driver.findElements(By.xpath("//tr[@bgcolor='#F2F4F7']"));
		
		driver.findElement(By.id("accion")).click();
		
		int count = 0;
		for (WebElement teacher : teachers) {
			
			for (int i = 0;i < 27;i++) {
					driver.findElement(By.id("r"+(i*5))).click();
			}
			driver.findElement(By.id("envio")).click();
			driver.findElement(By.id("accion")).click();
			count++;
		}
		
	}

}
