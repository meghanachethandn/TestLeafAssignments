package week2.day4;

public class Safari extends Browser {
	public void readerMode()  {
		System.out.println("Reader Mode");
	}
	public void fullScreenMode() {
		System.out.println("Full Screen Mode");
	}
	public static void main(String[] args) {
		Safari sa = new Safari();
		System.out.println(sa.browserName);
		System.out.println(sa.browserVersion);
		sa.readerMode();
		sa.fullScreenMode();
		sa.openURL();
		sa.closeBrowser();
		sa.navigateBack();

}
}
