package pkg;
import java.io.FileNotFoundException;
import java.util.*;
public class FileReadWrite{
	//private constructor, because java doesn't support top level static classes.
	private FileReadWrite() {}
	//Parser for FirstName|LastName|Address|Suite|City|State|ZIP|amountOwed
	public static ArrayList<Person> parse(java.io.File file) {
		ArrayList<Person> customers = new ArrayList<Person>();
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
				Person person = new Person(arr[0],arr[1],arr[2],arr[3],arr[4], arr[5], arr[6],Double.parseDouble(arr[7]));
				customers.add(person);
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

}
