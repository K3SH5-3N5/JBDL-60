import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionMain {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","admin123");
			    
				System.out.println("Database con:" + con);
				
				String query = "CREATE DATABASE IF NOT EXISTS jbdl60";
				
				Statement stmt = con.createStatement();
				
				System.out.println(stmt.execute(query));
				
				System.out.println("Schema created successfully");
				
				con.close();
						
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}	
		
	}
}
