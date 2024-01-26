package week3Day1;

public class HA_MOL_APIClient {
	
	public void sendRequest(String endpoint) {
		// TODO Auto-generated method stub
		System.out.println("The Hostname of the API is:" + endpoint);

	}
	
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		// TODO Auto-generated method stub
		System.out.println("The Hostname of the API is:" + endpoint);
		System.out.println("The Details of the API CLient:" + requestBody);
		System.out.println("API request Status:" +requestStatus);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HA_MOL_APIClient apic= new HA_MOL_APIClient();
		apic.sendRequest("Public");
		apic.sendRequest("Private", "firstname - Deepu, lastName - R", true);

	}

}
