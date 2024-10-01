package week2.day4;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("Take Snap");
	}
	public void clearCookies() {
		System.out.println("clear Cookies");
	}
	
	public static void main(String[] args) {
		Edge ed = new Edge();
		System.out.println(ed.browserName);
		System.out.println(ed.browserVersion);
		ed.takeSnap();
		ed.clearCookies();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
	}

}
