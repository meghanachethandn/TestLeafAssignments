package week3.day1.polymorphism;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		System.out.println("The send request end point is : "+ endPoint);
		
	}
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("The send request end point is : "+ endPoint +"\n"+ "Request body :" + requestBody +"\n"
				+"request status :"+requestStatus);
	}

	public static void main(String[] args) {
		APIClient apic = new APIClient();
		apic.sendRequest("EndPoint");
		apic.sendRequest("endPoint", "RequestBody", false);
	}

}
