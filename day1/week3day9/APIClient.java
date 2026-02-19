package week3day9;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println("The endpoint has following " + endpoint);

	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	
		System.out.println("The endpoint has following  " + endpoint);
		System.out.println("The requestBody has following  " + requestBody);
		System.out.println("The requestStatus has following  " + requestStatus);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient apiClient=new APIClient ();
		apiClient.sendRequest("Facebook");
		apiClient.sendRequest("gmail", "requestSent", true);
		
		
	}

}
