package pkg;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
public class DataCollection {

	public static void main(String[] args) {
		System.out.println("Testing my own branch");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		String name = scan.next();
		char gender = scan.next().charAt(0);
		java.io.File file = new java.io.File("babynameranking"+year+".txt");
		int rank;
		String maleName;
		int numOfMaleName;
		String femaleName;
		int numOfFemaleName;
		try {
			Scanner fileReader = new Scanner(file);
			for(int x = 0; x < 1000; x++) {
				rank = fileReader.nextInt();
				maleName = fileReader.next();
				numOfMaleName = fileReader.nextInt();
				femaleName = fileReader.next();
				numOfFemaleName = fileReader.nextInt();
				if(gender == 'M') {
					if(name == maleName) {
						System.out.println("The rank is " + rank);
					}
				}else {
					if(name == femaleName) {
						System.out.println("The rank is " + rank);
					}
				}
			}
		}catch(FileNotFoundException e){
			
		}
		
		
	}

}
