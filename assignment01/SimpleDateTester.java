package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate sd = new SimpleDate();
		SimpleDate sd_earlier = new SimpleDate();
		SimpleDate sd_later = new SimpleDate();
		System.out.println(sd.before(sd_earlier)); //should print false
		System.out.println(sd.before(sd_later)); //should print true
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		SimpleDate sd2 = new SimpleDate();
		SimpleDate sd_earlier2 = new SimpleDate();
		SimpleDate sd_later2 = new SimpleDate();
		output.println(sd2.before(sd_earlier2)); //should print false
		output.println(sd2.before(sd_later2)); //should print true
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}