import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite extends Player {
	
	
//	playerThree p3 = new playerThree();
//	p3.getStats();
	
	public void openWebSite() {
		//go to fantasy football site
	  System.setProperty("webdriver.chrome.driver","chromedriver");
		
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://fantasy.nfl.com/research/scoringleaders?position=1");
	  
	  
	  
	  
	}

}
