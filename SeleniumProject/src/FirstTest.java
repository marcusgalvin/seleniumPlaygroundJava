import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//go to google
		driver.get("https://www.google.com");
		
//		System.out.println(driver.getTitle());
//		
		
		//search for news
		driver.findElement(By.name("q")).sendKeys("rhode island covid 19");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//click news
		driver.findElement(By.className("qs")).click();

		//get info from tops news story
		var news = driver.findElement(By.className("phYMDf")).getText();
		System.out.println(news);
		
		//get the news source
		var newsSource = driver.findElement(By.className("pDavDe")).getText();
		System.out.println(newsSource);
		
		
		//click artile link
		driver.findElement(By.className("phYMDf")).click();
		
		
		//copy url
		String url = driver.getCurrentUrl();
		
		
		//pause
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//go to twitter
		
		driver.get("https://www.twitter.com/login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("session[username_or_email]")).sendKeys("//username//");
		driver.findElement(By.name("session[password]")).sendKeys("//password");
		driver.findElement(By.name("session[password]")).sendKeys(Keys.RETURN);
		
		
		//tweet
		driver.findElement(By.className("public-DraftStyleDefault-block")).sendKeys(news + "...");
		//hit enter for readablitiy
//		driver.findElement(By.className("public-DraftStyleDefault-block")).sendKeys(Keys.RETURN);

		driver.findElement(By.className("public-DraftStyleDefault-block")).sendKeys("news source: " + newsSource + "...");

		//paste link
		driver.findElement(By.className("public-DraftStyleDefault-block")).sendKeys("link: " + url);

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//send tweet
//		driver.findElement(By.xpath("\"//span[@class='add-tweet-button \n" + 
//				"       ']//following-sibling::button[contains(@class,'tweet-action')]\"")).click();
		
		
//		driver.findElement(By.className("r-qvurc0")).click();
//		driver.findElement(By.class("css-901oao)).click;
		
		
//		driver.findElement(By.className("r-30o5oe")).sendKeys("401-632-6759");
		
		
		
		
		
		
//		
//		driver.close();
		
		
		
	}

}
