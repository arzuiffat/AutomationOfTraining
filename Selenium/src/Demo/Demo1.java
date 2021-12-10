package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		

System.setProperty("webdriver,chrome.driver", "C://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
//java.lang.String title = driver.getTitle();
//System.out.println("Title of the Page:"+title);

 driver.close();
 driver.quit();
	}

}
