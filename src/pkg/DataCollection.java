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
		java.io.File file = new java.io.File("customers.txt");
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


