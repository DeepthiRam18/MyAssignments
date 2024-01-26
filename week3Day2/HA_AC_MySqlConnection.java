package week3Day2;

public abstract class HA_AC_MySqlConnection implements HA_IF_DatabaseConnection {

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("The table is UPDATED from Abstract Class MySqlConnection");
		
	}
	
	public abstract void executeInsert();	
	

}
