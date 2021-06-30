package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadingAFile {
	
public static void buffer() throws IOException {
	
	
	File file = new File("C:\\Users\\prakash\\eclipse-workspace\\JavaPractice\\sample");
	
	
	try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String s;
		Stream<String> l=br.lines();
		System.out.println(l.count());
		while((s=br.readLine())!=null)
			
			System.out.println(s);		
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
public static void scanner() {
	
File file = new File("C:\\Users\\prakash\\eclipse-workspace\\JavaPractice\\sample");
	
	
	try {
		Scanner sr = new Scanner(file);
		
		String s;
	
		while((s=sr.next())!=null) {
			if(s==null) 		
				System.out.println("Empty Line Found");			
			System.out.println(s);		
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	


	public static void main(String[] args) throws IOException {
	
		ReadingAFile.scanner();
		ReadingAFile.buffer();
		
		
	
	}

}
