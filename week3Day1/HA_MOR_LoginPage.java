package week3Day1;

public class HA_MOR_LoginPage extends HA_MOR_BasePage {

	
	@Override
	public void performCommonTasks() {
		// To call Super class method
		//super.performCommonTasks();
		System.out.println("The Login Information is Registered");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HA_MOR_LoginPage lp= new HA_MOR_LoginPage();
		lp.enterText();
		lp.findElement();
		lp.clickElement();
		lp.performCommonTasks();

	}

}
