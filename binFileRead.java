package day9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class binFileRead {
	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\Users\\leepe\\eclipse-workspace\\training\\src\\main\\java\\day9\\input.dat");
		byte[] bytes = "ABCD".getBytes(StandardCharsets.UTF_8);
		try {
			Files.write(path, bytes);
			System.out.println("Successfully written data to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] readBytes = null;
		
		try {
			readBytes = Files.readAllBytes(path);
			String string = new String(readBytes);
			System.out.println(string);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
//		File folder = new File("C:\\Users\\leepe\\eclipse-workspace\\training\\src\\main\\java\\day9");
//		getSubFiles(folder);
//	}
	
//	private static void getSubFiles(File folder) {
//		File files[] = folder.listFiles();
//		for (File file: files) {
//			if(file.isFile()) {
//				System.out.println(file);
//			} else {
//				getSubFiles(file);
//				System.out.println("Its folder " + file);
//			}
//		}
	}

}
