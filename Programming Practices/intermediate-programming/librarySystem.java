package puzzles;
import javax.swing.JOptionPane;


public class librarySystem {
	public static void main(String[] args) {
	
     book book1 = new book(1, "Java Basics", "John Smith", true, "", 0);
     book book2 = new book(2, "OOP Concepts", "Jane Doe", true, "", 0);
     book book3 = new book(3, "Data Structures", "Mark Lee", true, "", 0);
     
     book[] books = {book1, book2, book3};
     
     int choice = 0;
     
     do {
    	 
    	 choice = Integer.parseInt(JOptionPane.showInputDialog(
    			 null,
    			 "====== LIBRARY MENU ======\n[1] DISPLAY BOOK\n[2] BORROW BOOKS\n[3] RETURN BOOK\n[4] EXIT\n========================",
    			 "LIBRA",
    			 1));
    	 
    	 switch(choice) {
    	 
    	 case 1:
    		 JOptionPane.showMessageDialog(
    				 null,
    				 "BOOK INFORMATION!",
    				 "LIBRA",
    				 1);
    		 
             for (book buk : books) {
                 buk.displayBookInfo();
             }
             
             break;
             
    	 case 2:
    		 
    		 int borrowId = Integer.parseInt(JOptionPane.showInputDialog(
    				 null,
    				 "ENTER BOOK ID TO BORROW: ",
    				 "LIBRA",
    				 1));
    		 
    		 book borrowBook = findBookById(books, borrowId);
    		 
    		 if (borrowBook != null) {
    			 String name = JOptionPane.showInputDialog(
    					 null,
    					 "ENTER NAME: ",
    					 "LIBRA",
    					 1);
    			 int days = Integer.parseInt(JOptionPane.showInputDialog(
    					 null,
    					 "ENTER NUMBER OF DAYS TO BORROW:",
    					 "LIBRA",
    					 1));
    			 borrowBook.borrowBook(name, days);
    		 } else {
    			 JOptionPane.showMessageDialog(
    					 null,
    					 "BOOK NOT FOUND",
    					 "LIBRA",
    					 0);
    		 }
    		 break;
    		
    	 case 3:
    		 
    		 int returnId = Integer.parseInt(JOptionPane.showInputDialog(
    				 null,
    				 "ENTER BOOK ID TO RETURN:",
    				 "LIBRA",
    				 1));
    		 
    		 book returnBook = findBookById(books, returnId);
    		 
    		 if (returnBook != null) {
    			 returnBook.returnBook();
    		 } else {
    			 JOptionPane.showMessageDialog(
    					 null,
    					 "BOOK NOT FOUND",
    					 "LIBRA",
    					 0);
             }
             break;
    		 
    	 case 4:
    	 
    		 JOptionPane.showMessageDialog(
    				 null,
    				 "EXITING SYSTEM...",
    				 "LIBRA",
    				 1);
    		 break;
    		 
    	 default:	 
    		 JOptionPane.showMessageDialog(
    				 null,
    				 "ENTER VALID CHOICE!",
    				 "LIBRA",
    				 0);
    	 }
    	 
    	 
    	 
     } while (choice != 4);
		
		
	}
	 public static book findBookById(book[] books, int id) {
	        for (book book : books) {
	            if (book.getBookId() == id) {
	                return book;
	            }
	        }
	        return null;
	    }
}
