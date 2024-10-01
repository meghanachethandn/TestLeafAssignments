package week2.day4;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("open Incognito");
	}
	public void clearCache() {
		System.out.println("clear Cache");
	}

public static void main(String[] args) {
	Chrome ch = new Chrome();
	System.out.println(ch.browserName);
	System.out.println(ch.browserVersion);
	ch.openIncognito();
	ch.clearCache();
	ch.openURL();
	ch.closeBrowser();
	ch.navigateBack();
}
}
