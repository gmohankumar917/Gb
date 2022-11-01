package windows_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		WebElement w1= driver.findElement(By.xpath("//*[text()='Open New Seperate Windows']"));
		
		javaScriptExecutor js= (javaScriptExecutor)driver;
		js.executeScript("arguments[0].click()")
		
	}

}
