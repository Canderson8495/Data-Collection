package pkg;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
public class DataCollection {

	public static void main(String[] args) {
		java.io.File file = new java.io.File("C:\\Code\\Java\\Txt.txt");
		ArrayList<Person> customers = FileReadWrite.parse(file);
		for(Person p : customers) {
			p.accrueMonthlyInterest();
			System.out.println(p);
		}
	} 
}
