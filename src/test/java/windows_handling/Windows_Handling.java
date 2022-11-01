package windows_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();

		//	 System.out.println(driver.getTitle()); 

		Set <String> s= driver.getWindowHandles();

		for (String i : s) {

			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if(t.contains("Frames & windows")) {
				Thread.sleep(3000);
				driver.close();
			}
		}


		//	 driver.findElement(By.xpath("")).click();

	}

}
