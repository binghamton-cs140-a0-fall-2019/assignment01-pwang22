package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {
	public static void main(String[] args) {
		//TODO make 4 different Computer objects with different 
		//combinations of disk size (two more than a terabyte and two less)
		//and for each make one an SSD drive and the other not.
		//Then call System.out.println(comp); for each "comp" object
		//and observe that there are small differences in how the computer
		//information prints out.
		
		Computer c1 = new Computer("Lenovo", "Intel Core i7", 16, 1256, false, 900.0);
		Computer c2 = new Computer("Asus", "Intel Core i5", 32, 2000, false, 500.0);
		Computer c3 = new Computer("HP", "Intel Core i3", 8, 500, true, 300.0);
		Computer c4 = new Computer("Toshiba", "Intel Core i7", 16, 256, true, 600.0);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);	
		
	
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		Computer c12 = new Computer("Lenovo", "Intel Core i7", 16, 1256, false, 900.0);
		Computer c22 = new Computer("Asus", "Intel Core i5", 32, 2000, false, 500.0);
		Computer c32 = new Computer("HP", "Intel Core i3", 8, 500, true, 300.0);
		Computer c42 = new Computer("Toshiba", "Intel Core i7", 16, 256, true, 600.0);
		
		output.println(c12);
		output.println(c22);
		output.println(c32);
		output.println(c42);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}