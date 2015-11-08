package customermodule;

import java.sql.Connection;

public class Main {
	public static void main(String[] args){
		
		ConnectDB db = new ConnectDB();
		Connection conn = db.getConnection();
		CustomerGUI main = new CustomerGUI(conn);
		
	}

}
