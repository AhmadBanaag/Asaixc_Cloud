package allAboutJ.writingAndReading;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writingCode {
	
	// Writing a file using Java
	// File Writer = Good for small or medium-sized text files
	// Buffered Writer = Better Performance for large amounts of text
	// PrintWriter = Best for structured data, like reports or logs
	// FileOutputSteam = Best for binary files (e.g., images, audio files)

	public static void main(String[] args) {
		
	String filePath = "C:\\Users\\Ahmad Banaag\\Documents\\textFiles\\tests.txt";
	String textContent = "Hello, trying this BRO CODE!";
	
	
	try(FileWriter writer = new FileWriter(filePath)) {
		writer.write(textContent);
		System.out.println("File has been written!");
	} 
	catch(FileNotFoundException e) {
		System.out.println("Could not locate file location! ");
	}

	catch(IOException e) {
		System.out.println("Could not write the file!");
	}
}

}
