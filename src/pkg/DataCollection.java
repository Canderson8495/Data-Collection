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
		ArrayList<Customer> customers = FileReadWrite.parse(file);
		for(Person p : customers) {
			//We're just casting customer here to upkeep our inheritance.
			//Ask me about this tomorrow.
			if(p instanceof Customer)
				((Customer)p).accrueMonthlyInterest();
			System.out.println(p);
		}
		FileReadWrite.write(customers);
	} 
}

//John's code
/*String fileName = ("Data-Collection/Data Letter");
FileReader reader = new FileReader("Data-Collection/Data Letter");
BufferedReader buffer = new BufferedReader(reader);
PrintWriter writer = new PrintWriter ("Data-Collection/Data Letter");

while ((fileName = buffer.readLine()) !=null) {
writer.println (fileName);
*/

