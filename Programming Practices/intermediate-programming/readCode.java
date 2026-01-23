package allAboutJ.writingAndReading;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class readCode {
	public static void main(String[] args) throws FileNotFoundException {
		
		String filePath = "C:\\Users\\Ahmad Banaag\\Documents\\textFiles\\dataList.txt";
		
		Scanner input = new Scanner(new File(filePath));
		
		int unitPrice = 0;
		double quantity = 0;
		double total = 0;
		
		unitPrice = input.nextInt();
		quantity = input.nextDouble();
		total = unitPrice * quantity;
		
		System.out.println(total);
		
	}

}
