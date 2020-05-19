import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Players;
import com.luv2code.hibernate.demo.entity.*;


public class Scraper {
	
	String player;
	String playerCard;
	String passingYards;
	String passingTouchdowns;
	String picks;
	String rushYards;
	String lostFumbles;
	String fantasyPoints;
	String year;
	
	public void Player(String player, String playerCard, String passingYards, String passingTouchdowns, String picks,
			String rushYards, String lostFumbles, String fantasyPoints, String year) {
		this.player = player;
		this.playerCard = playerCard;
		this.passingYards = passingYards;
		this.passingTouchdowns = passingTouchdowns;
		this.picks = picks;
		this.rushYards = rushYards;
		this.lostFumbles = lostFumbles;
		this.fantasyPoints = fantasyPoints;
		this.year = year;
	}
	
			
	public void getStats() {
		
		//prompt player input
		System.out.println("Choose player: ");
		Scanner getPlayerName = new Scanner(System.in);
		player = getPlayerName.nextLine();
		
		//web driver	
		System.setProperty("webdriver.chrome.driver","chromedriver");		
		WebDriver driver = new ChromeDriver();

		final String Url = "https://fantasy.nfl.com/research/scoringleaders?position=1";		
		driver.get(Url);
		
		driver.get("https://fantasy.nfl.com/research/scoringleaders?position=1");
		
		//search player
        driver.findElement(By.id("searchQuery")).click();;       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("searchQuery")).sendKeys(player);
	    driver.findElement(By.name("jSubmit")).click();
	    
		    
	    //get player name
	    playerCard = driver.findElement(By.className("playerNameFull")).getText();
	    		    	    	    
	    System.out.println(player + ":");
	    passingYards = driver.findElement(By.className("statId-5")).getText();
	    
	    if(passingYards == "-") {
	    	System.out.print("not found");
	    } else {
	    	System.out.println("passing yards: " + passingYards);

	    }
	    	    
	    passingTouchdowns = driver.findElement(By.className("statId-6")).getText();
	    if(passingTouchdowns == "-") {
	    	System.out.print("not found");
	    } else {
		    System.out.println("passing touchdowns: " + passingTouchdowns);

	    }
	    

	    picks = driver.findElement(By.className("statId-7")).getText();
	    if(picks == "-") {
	    	System.out.print("not found");
	    } else {
	    	System.out.println("picks: " + picks);
	    }
	    
	    

	    rushYards = driver.findElement(By.className("statId-14")).getText();
	    
	    if(rushYards == "-") {
	    	System.out.print("not found");
	    } else {
	    	System.out.println("rushing yards: " + rushYards);
	    }
	    

	    lostFumbles = driver.findElement(By.className("statId-30")).getText();
	    if(lostFumbles == "-") {
	    	System.out.print("not found");
	    } else {
		    System.out.println("lost fumbles: " + lostFumbles);

	    }

	    fantasyPoints = driver.findElement(By.className("playerSeasonTotal")).getText();
	    
	    if(fantasyPoints == "-") {
	    	System.out.print("not found");
	    } else {
	    	System.out.println("total fantasy points: " + fantasyPoints);

	    }
	    
	    
	    System.out.println("-----------------------");
	    
	    //close driver
	    driver.quit();
	    
	    	
	}
	
	
public void saveDataWithHibernate() {
	//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Players.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create player object
			System.out.println("Creating a new player object...");
			Players tempPlayer = new Players(playerCard, passingYards, passingTouchdowns, picks, rushYards, 
					lostFumbles, fantasyPoints);
			
			//start a transaction
			session.beginTransaction();	
			
			//save player object
			System.out.println("Saving the player...");
			session.save(tempPlayer);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
			}
		finally {
			factory.close();
		}
	
	}
	
}
