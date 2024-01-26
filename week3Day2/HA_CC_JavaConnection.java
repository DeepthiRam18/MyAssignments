package week3Day2;

public class HA_CC_JavaConnection extends HA_AC_MySqlConnection {
	
	

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to the Database");
		
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Dis-Connected from the Database");
		
	}

	@Override
	public void executeInsert() {
		// TODO Auto-generated method stub
		System.out.println("Running an insert statement to insert a value in the database");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HA_CC_JavaConnection cjc= new HA_CC_JavaConnection();
		cjc.connect();
		cjc.disconnect();
		cjc.executeUpdate();
		cjc.executeInsert();

	}

}
