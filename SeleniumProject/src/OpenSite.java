import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite {
	
	public void openWebSite() {
		//go to google
	  System.setProperty("webdriver.chrome.driver","chromedriver");
		
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://fantasy.nfl.com/research/scoringleaders?position=1");
	}

}
