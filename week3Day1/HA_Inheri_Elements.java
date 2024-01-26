package week3Day1;

public class HA_Inheri_Elements extends HA_Inheri_Button_SubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HA_Inheri_Elements obj= new HA_Inheri_Elements();
		
		obj.click();
		obj.setText("The setText method is called from Button Class");
		obj.submit();
		
		HA_Inheri_RadioButton rbObj = new HA_Inheri_RadioButton();
		rbObj.selectRadioButton();
		
		HA_Inheri_CheckBoxButton cbObj = new HA_Inheri_CheckBoxButton();
		cbObj.clickCheckButton();
		
		HA_Inheri_TextField txtObj = new HA_Inheri_TextField();
		txtObj.getText();
		txtObj.click();
		txtObj.setText("The setText method is called from Text Field Class");
		
	

	}

}
