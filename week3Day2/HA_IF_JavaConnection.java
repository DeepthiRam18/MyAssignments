package week3Day2;

public class HA_IF_JavaConnection implements HA_IF_DatabaseConnection{
	

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to the DataBase");
		
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Dis-Connected from the DataBase");
		
		
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		
		System.out.println("Excecuting Update table method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HA_IF_JavaConnection jc= new HA_IF_JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		
	}

}
