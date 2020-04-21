import java.util.concurrent.TimeUnit;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

	public static void main(String[] args) {
		
		
//		OpenSite start = new OpenSite();
//		start.openWebSite();

		
		playerOne p1 = new playerOne();
		p1.getStats();
					
		playerTwo p2 = new playerTwo();
		p2.getStats();
		
		//logic tests
		
		int p1Rushing = Integer.parseInt(p1.rushYards);
		int p2Rushing = Integer.parseInt(p2.rushYards);
		
		
		if(p1Rushing > p2Rushing) {
			System.out.println(p1.player + " " + "has more total rushing yards");
		} if(p2Rushing > p1Rushing) {
			System.out.println(p2.player + " " + "has more total rushing yards");
		} if(p1Rushing == p2Rushing) {
			System.out.println("the two players are tied");
		}

		
		
		

		
		

	    

	    

	    

	    
		
		
		

		
		
		
	}

}
