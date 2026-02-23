package puzzles;

import javax.swing.JOptionPane;

public class book {
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;
	private String borrowerName;
	private int daysBorrowed;
	
	private static int bookCount = 0;
	
	public book() {
	 this.bookId = 0;
	 this.title = "Unknown";
	 this.author = "Unknown";
	 this.isAvailable = true;
	 this.borrowerName = "Unknown";
	 this.daysBorrowed = 0;
	 bookCount++;
	}
	
	public book(int bookId, String title, String author, boolean isAvailable, String borrowerName, int daysBorrowed) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
		this.borrowerName = borrowerName;
		this.daysBorrowed = daysBorrowed;
		bookCount++;
	}
	
	public void borrowBook(String borrowerName, int daysBorrowed) {
		if (isAvailable) {
			this.isAvailable = false;
			this.borrowerName = borrowerName;
			this.daysBorrowed = 0;
			JOptionPane.showMessageDialog(
					null,
					"BOOK BORROWED SUCCESFULLY!",
					"LIBRA",
					1);
		} else {
			JOptionPane.showMessageDialog(
					null,
					"BOOK IS ALREADY BORROWED! \nPLEASE TRY AGAIN!",
					"LIBRA",
					0);
		}
	}
	
	public void returnBook() {
		if (!isAvailable) {
		isAvailable = true;
		borrowerName = "";
		daysBorrowed = 0;
		JOptionPane.showMessageDialog(
				null,
				"BOOK RETURNED SUCCESFULLY!",
				"LIBRA",
				1);
		} else {
			JOptionPane.showMessageDialog(
					null,
					"BOOK IS ALREADY AVAILABLE!",
					"LIBRA",
					0);
		}
	}
	
	public void displayBookInfo() {
		JOptionPane.showMessageDialog(
				null,
				"===== BOOK INFORMATION =====" +
				"\nBOOK ID: " +
				bookId + 
				"\nTITLE: " +
				title + 
				"\nBOOK AUTHOR: " +
				author +
				"\nSTATUS: " +
				(isAvailable ? "AVAILABLE" : "BORROWED"),
				"LIBRA",
				1);
		
		if (!isAvailable) {
			JOptionPane.showMessageDialog(
					null,
					"BORROWER: " + 
					borrowerName +
					"\nDAYS BORROWED: " +
					daysBorrowed,
					"LIBRA",
					1);
		}
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public static int getBookCount() {
		return bookCount;
	}
	
}
