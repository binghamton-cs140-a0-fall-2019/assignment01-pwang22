package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dpob_loeb = new DateAndPlaceOfBirth(1974, 2, 26, "Haguenau", "France");
		StreetUSAddress adr_loeb = new StreetUSAddress("7001 396th Dr SE", "", "Snoqualmie", "WA", "98065");
		Person loeb = new Person("Sebastien", "Loeb", "557-62-4832", dpob_loeb, adr_loeb);
		System.out.println(loeb);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth dpob_loeb2 = new DateAndPlaceOfBirth(1974, 2, 26, "Haguenau", "France");
		StreetUSAddress adr_loeb2 = new StreetUSAddress("7001 396th Dr SE", "", "Snoqualmie", "WA", "98065");
		Person loeb2 = new Person("Sebastien", "Loeb", "557-62-4832", dpob_loeb2, adr_loeb2);
		output.println(loeb2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}