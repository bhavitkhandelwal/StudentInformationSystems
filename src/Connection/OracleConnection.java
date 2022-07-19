package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
//	Driver name
	private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER="hr";
	private static final String PASS="hr";
	
	public static Connection getConnection() {
//		connection is an interface thats why you can not declare its object thats why this class
		
		Connection conn=null;
		
		try {
			// object of connection
//			static method
			conn=DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		if(getConnection()!=null) {
			System.out.println("Connected.");
		}
		else {
			System.out.println("Not connected.");
		}

	}
}
