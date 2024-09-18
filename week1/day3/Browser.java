package week1.day3;

public class Browser {
	
	public String launchBrowser(String Browsername) {
		String browser ="Browser lanuched succesfully";
		System.out.println("Input argument of launch browser method is:" +Browsername);
		return browser;
		
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		
		Browser br = new Browser();
		System.out.println(br.launchBrowser("chrome"));
		br.loadUrl();
		
	}

}
