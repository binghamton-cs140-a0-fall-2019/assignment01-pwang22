package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
	public static void main(String[] args) {
		
		DateAndPlaceOfBirth joel = new DateAndPlaceOfBirth(2010, 11, 6, "San Francisco", "California", "United States");
		DateAndPlaceOfBirth lily = new DateAndPlaceOfBirth(2010, 11, 6, "New York", "New York", "United States");
		DateAndPlaceOfBirth peter = new DateAndPlaceOfBirth(1998, 11, 6, "Dalton", "New Hampshire", "United States");
		DateAndPlaceOfBirth mcrae = new DateAndPlaceOfBirth(1968, 8, 5, "Lanark", "Scotland");
		DateAndPlaceOfBirth loeb = new DateAndPlaceOfBirth(1974, 2, 26, "Haguenau", "France");
		
		System.out.println(joel);
		System.out.println(lily);
		System.out.println(peter);
		System.out.println(mcrae);
		System.out.println(loeb);
		
		/*
		expected output:
		false
		false
		true
		true
		
		false
		true
		false
		true
		
		true
		false
		false
		true
		
		false
		true
		false
		false
		*/
		
		System.out.println(joel.olderThan(lily));
		System.out.println(joel.youngerThan(lily));
		System.out.println(joel.hasSameBirthDateAs(lily));
		System.out.println(joel.hasSameBirthDayAs(lily));
		System.out.println();
		System.out.println(lily.olderThan(peter));
		System.out.println(lily.youngerThan(peter));
		System.out.println(lily.hasSameBirthDateAs(peter));
		System.out.println(lily.hasSameBirthDayAs(peter));
		System.out.println();
		System.out.println(peter.olderThan(lily));
		System.out.println(peter.youngerThan(lily));
		System.out.println(peter.hasSameBirthDateAs(lily));
		System.out.println(peter.hasSameBirthDayAs(lily));
		System.out.println();
		System.out.println(loeb.olderThan(mcrae));
		System.out.println(loeb.youngerThan(mcrae));
		System.out.println(loeb.hasSameBirthDateAs(mcrae));
		System.out.println(loeb.hasSameBirthDayAs(mcrae));
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		DateAndPlaceOfBirth joel2 = new DateAndPlaceOfBirth(2010, 11, 6, "San Francisco", "California", "United States");
		DateAndPlaceOfBirth lily2 = new DateAndPlaceOfBirth(2010, 11, 6, "New York", "New York", "United States");
		DateAndPlaceOfBirth peter2 = new DateAndPlaceOfBirth(1998, 11, 6, "Dalton", "New Hampshire", "United States");
		DateAndPlaceOfBirth mcrae2 = new DateAndPlaceOfBirth(1968, 8, 5, "Lanark", "Scotland");
		DateAndPlaceOfBirth loeb2 = new DateAndPlaceOfBirth(1974, 2, 26, "Haguenau", "France");
		
		output.println(joel2);
		output.println(lily2);
		output.println(peter2);
		output.println(mcrae2);
		output.println(loeb2);
		
		output.println(joel2.olderThan(lily2));
		output.println(joel2.youngerThan(lily2));
		output.println(joel2.hasSameBirthDateAs(lily2));
		output.println(joel2.hasSameBirthDayAs(lily2));
		output.println();
		output.println(lily2.olderThan(peter2));
		output.println(lily2.youngerThan(peter2));
		output.println(lily2.hasSameBirthDateAs(peter2));
		output.println(lily2.hasSameBirthDayAs(peter2));
		output.println();
		output.println(peter2.olderThan(lily2));
		output.println(peter2.youngerThan(lily2));
		output.println(peter2.hasSameBirthDateAs(lily2));
		output.println(peter2.hasSameBirthDayAs(lily2));
		output.println();
		output.println(loeb2.olderThan(mcrae2));
		output.println(loeb2.youngerThan(mcrae2));
		output.println(loeb2.hasSameBirthDateAs(mcrae2));
		output.println(loeb2.hasSameBirthDayAs(mcrae2));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}