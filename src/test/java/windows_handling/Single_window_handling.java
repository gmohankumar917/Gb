package windows_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_window_handling {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_TAB);
		
		
	}

}
