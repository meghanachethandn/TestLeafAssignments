package week1.day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser br = new Browser();
		System.out.println(br.launchBrowser("chrome"));
		br.loadUrl();
	}

}
