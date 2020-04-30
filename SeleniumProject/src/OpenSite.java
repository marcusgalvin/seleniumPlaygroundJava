import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSite extends Player {
	
	
//	playerThree p3 = new playerThree();
//	p3.getStats();
	
	public OpenSite(String player, String playerCard, String passingYards, String passingTouchdowns, String picks,
			String rushYards, String lostFumbles, String fantasyPoints, String year) {
		super(player, playerCard, passingYards, passingTouchdowns, picks, rushYards, lostFumbles, fantasyPoints, year);
		// TODO Auto-generated constructor stub
	}

	public void openWebSite() {
		//go to fantasy football site
	  System.setProperty("webdriver.chrome.driver","chromedriver");
		
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://fantasy.nfl.com/research/scoringleaders?position=1");
	  
	  
	  
	  
	}

}
