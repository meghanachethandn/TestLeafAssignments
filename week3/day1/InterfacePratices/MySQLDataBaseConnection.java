package week3.day1.InterfacePratices;

public class MySQLDataBaseConnection implements DataBaseConnection{


	public void connect() {
		System.out.println("Connecting to Data Base connection");
		
	}

	public void disconnect() {
		System.out.println("DisConnecting to Data Base Connection");
		
	}

	public void executeUpdate() {
		System.out.println("Execution steps increases");
		
	}
	
	public static void main (String []args) {
		MySQLDataBaseConnection msqlconn = new MySQLDataBaseConnection();
		msqlconn.connect();
		msqlconn.disconnect();
		msqlconn.executeUpdate();
	}

}
