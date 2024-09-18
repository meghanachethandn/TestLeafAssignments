package week1.day4;

public class Library {

	public static void main(String[] args) {
		Library lib= new Library();
		lib.addBook("Selenium Webdriver");
		lib.issueBook();
	}
	
	public String addBook(String bookTitle) {
		System.out.println("Book Title to be add is : "+bookTitle);
		System.out.println("Book added sucessfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued sucessfully");
	}

}
