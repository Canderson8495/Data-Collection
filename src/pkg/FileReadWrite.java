package pkg;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FileReadWrite{
	//private constructor, because java doesn't support top level static classes.
	private FileReadWrite() {}
	//Parser for FirstName|LastName|Address|Suite|City|State|ZIP|amountOwed
	public static ArrayList<Customer> parse(java.io.File file) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		String line;
		//The values of the array will be initialized as the pattern for parsing state above
		String arr[] = new String[8];
		try(Scanner scan = new Scanner(file)){
			StringBuffer str = new StringBuffer("");
			while(scan.hasNextLine()) {
				int index = 0;
				line = scan.nextLine();
				for( int x = 0; x < line.length(); x++) {
					if(line.charAt(x) != '|')
						str.append(line.charAt(x));
					else {
						arr[index] = str.toString();
						str.delete(0,str.length());
						System.out.println(arr[index]);
						index++;
					}
				}
				//Dealing w/ the corner case dollar sign.
				str.delete(0, 1);
				arr[index] = str.toString();
				str.delete(0,  str.length());
				System.out.println("Finished parsing");
				//Loading a Person object and throwing it into a arrayList that is to be returned.
				customers.add(new Customer(arr[0],arr[1],arr[2],arr[3],arr[4], arr[5], arr[6],Double.parseDouble(arr[7])));
			}
		}catch(FileNotFoundException error) {
			System.out.println("The file doesn't exist|"+error);
			System.exit(0);
		}catch(NumberFormatException error) {
			System.out.println("There is an issue w/ the file setup |" + error);
			System.exit(0);
		}
		return customers;
	}
	public static void write(ArrayList<Customer> people) {
		for(int x = 0; x  < people.size(); x++) {
			//For each loop in this for loop create a new file, write to it, and close everything in the final block.
			try (FileWriter writer = new FileWriter("Files\\FileName.txt")){
				//In here you will write the logic for creating the formatted document. Research the FileWriter for more information.
				writer.write("Klappa has not paid");
				
			}catch(IOException error) {
				System.out.println("ERROR" + error);
			}
		}
	}

}
