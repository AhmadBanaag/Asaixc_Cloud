package Default;
import javax.swing.JOptionPane;

public class miniLibrarySystem {

    public static void main(String[] args) {

        String[] books = new String[50];
        boolean[] available = new boolean[50];
        int count = 0;

        while (true) {
            String menu = 
                "===== MINI LIBRARY SYSTEM =====\n" +
                "1 - Add a Book\n" +
                "2 - Borrow a Book\n" +
                "3 - Return a Book\n" +
                "4 - View All Books\n" +
                "5 - Exit\n\n" +
                "Choose an option:";
            
            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (choice) {

                case 1: // Add Book
                    if (count < 50) {
                        String title = JOptionPane.showInputDialog("Enter book title:");
                        books[count] = title;
                        available[count] = true;
                        count++;
                        JOptionPane.showMessageDialog(null, "Book added successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Library is full!");
                    }
                    break;

                case 2: // Borrow Book
                    if (count == 0) {
                        JOptionPane.showMessageDialog(null, "No books to borrow.");
                        break;
                    }

                    String borrowStr = JOptionPane.showInputDialog("Enter book number to borrow:");
                    int borrowIndex = Integer.parseInt(borrowStr);

                    if (borrowIndex < 1 || borrowIndex > count) {
                        JOptionPane.showMessageDialog(null, "Invalid book number!");
                    } else if (!available[borrowIndex - 1]) {
                        JOptionPane.showMessageDialog(null, "Book is already borrowed!");
                    } else {
                        available[borrowIndex - 1] = false;
                        JOptionPane.showMessageDialog(null,
                            "You borrowed: " + books[borrowIndex - 1]);
                    }
                    break;

                case 3: // Return Book
                    if (count == 0) {
                        JOptionPane.showMessageDialog(null, "No books in the library yet.");
                        break;
                    }

                    String returnStr = JOptionPane.showInputDialog("Enter book number to return:");
                    int returnIndex = Integer.parseInt(returnStr);

                    if (returnIndex < 1 || returnIndex > count) {
                        JOptionPane.showMessageDialog(null, "Invalid book number!");
                    } else if (available[returnIndex - 1]) {
                        JOptionPane.showMessageDialog(null, "Book is already available!");
                    } else {
                        available[returnIndex - 1] = true;
                        JOptionPane.showMessageDialog(null, "Book returned successfully!");
                    }
                    break;

                case 4: // View All Books
                    if (count == 0) {
                        JOptionPane.showMessageDialog(null, "No books added yet.");
                        break;
                    }

                    String list = "===== BOOK LIST =====\n";
                    for (int i = 0; i < count; i++) {
                        list += (i + 1) + ". " + books[i] +
                                "  [" + (available[i] ? "Available" : "Borrowed") + "]\n";
                    }
                    JOptionPane.showMessageDialog(null, list);
                    break;

                case 5: // Exit
                    JOptionPane.showMessageDialog(null, "Exiting program... Goodbye!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option! Try again.");
            }
        }
    }
}