package pkg;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataCollection {

	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("C:\\Code\\Java\\Txt.txt");
		ArrayList<Person> customers = FileReadWrite.parse(file);
		for(Person p : customers) {
			p.accrueMonthlyInterest();
			System.out.println(p);
			
			String fileName = ("C:\\Code\\Java\\Txt.txt");
			FileReader reader = new FileReader("C:\\Code\\Java\\Txt.txt");
			BufferedReader buffer = new BufferedReader(reader);
			PrintWriter writer = new PrintWriter ("C:\\Code\\Java\\Txt.txt");
			
			while ((fileName = buffer.readLine()) !=null) {
			writer.println ("C:\\Code\\Java\\Txt.txt");
		}
	} 
}


}