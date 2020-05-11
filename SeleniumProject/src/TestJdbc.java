
import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/nfl_player_tracker?useSSL=false";
		String user = "nflplayer";
		String pass = "nflplayer";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection Successful!");
			
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		
	}

}
