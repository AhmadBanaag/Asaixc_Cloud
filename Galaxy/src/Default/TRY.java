package Default;
import javax.swing.JOptionPane;

public class TRY {
    public static void main(String[] args) {
        String table = "";
        table += String.format("%-15s %-5s %-7s\n", "Name", "Age", "Grade");
        table += "----------------------------------\n";
        table += String.format("%-15s %-5d %-7.2f\n", "John", 18, 90.5);
        table += String.format("%-15s %-5d %-7.2f\n", "Alexander", 19, 85.0);
        table += String.format("%-15s %-5d %-7.2f\n", "Mia", 20, 95.0);

        JOptionPane.showMessageDialog(
            null,
            "<html><pre>" + table + "</pre></html>",
            "Student Table",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
