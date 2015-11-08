package customermodule;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	Connection conn;
	public ConnectDB() {

		try {
			conn = DriverManager
					.getConnection("jdbc:ucanaccess://C:\\Users\\mirir\\Documents\\OrderTrackingDB.accdb");

		} catch (Exception err) {
			System.out.println(err);
		}
		System.out.println("Connection successful! ");

	}
	public Connection getConnection(){
		return conn;
	}
}
