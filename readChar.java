package day9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class readChar {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\leepe\\eclipse-workspace\\training\\src\\main\\java\\day9\\test.txt");
		FileWriter out = null;
		try {
			Scanner readFile = new Scanner(path);
			while (readFile.hasNextLine()) {
				String data = readFile.nextLine();
				System.out.println(data);
			}
			readFile.close();
		} catch (IOException e) {
			System.out.println("An Error has occured.");
			e.printStackTrace();
		}
		
		try {
			File myObj = new File("output.txt");
			String send = "Goodbye World!";
			out = new FileWriter("C:\\Users\\leepe\\eclipse-workspace\\training\\src\\main\\java\\day9\\output.txt");
			  for (int i = 0; i < send.length(); i++) {
	                out.write(send.charAt(i));
			  }
			  out.close();
			  System.out.println("Wrote to file.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
