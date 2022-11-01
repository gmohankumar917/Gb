package windows_handling;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutor {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.microfocus.com/en-us/home");
				
		Actions act=new Actions(driver);
		WebElement view=driver.findElement(By.xpath("(//strong[text()='10'])[2]"));
		act.moveToElement(view).build().perform();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File(".\\Screenshots\\homepage.png");
		
		FileUtils.copyFile(src, trg);
	}

}
