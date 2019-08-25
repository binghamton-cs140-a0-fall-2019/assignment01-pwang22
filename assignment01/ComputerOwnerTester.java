package assignment01;

public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dpob_mcrae = new DateAndPlaceOfBirth(1968, 8, 5, "Lanark", "Scotland");
		StreetUSAddress adr_mcrae = new StreetUSAddress("178 Miller Rd", "", "Dalton", "NH", "03598");
		Person mcrae = new Person("Colin", "McRae", "557624832", dpob_mcrae, adr_mcrae);
		ComputerOwner colin = new ComputerOwner(mcrae);
		Computer c1 = new Computer("Lenovo", "Intel i7", 16, 256, true, 700.0);
		Computer c2 = new Computer("Asus", "Intel i7", 16, 1000, false, 800.0);
		Computer c3 = new Computer("MSi", "Intel i5", 32, 1256, false, 1124.99);
		Computer c4 = new Computer("Dell", "Intel i3", 8, 512, false, 289.00);
		colin.addComputer(c1);
		colin.addComputer(c2);
		colin.addComputer(c3);
		colin.addComputer(c4);
		System.out.println(colin);
		colin.removeComputer(0);
		colin.removeComputer(1);
		System.out.println(colin);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth dpob_mcrae2 = new DateAndPlaceOfBirth(1968, 8, 5, "Lanark", "Scotland");
		StreetUSAddress adr_mcrae2 = new StreetUSAddress("178 Miller Rd", "", "Dalton", "NH", "03598");
		Person mcrae2 = new Person("Colin", "McRae", "557624832", dpob_mcrae2, adr_mcrae2);
		ComputerOwner colin2 = new ComputerOwner(mcrae2);
		Computer c12 = new Computer("Lenovo", "Intel i7", 16, 256, true, 700.0);
		Computer c22 = new Computer("Asus", "Intel i7", 16, 1000, false, 800.0);
		Computer c32 = new Computer("MSi", "Intel i5", 32, 1256, false, 1124.99);
		Computer c42 = new Computer("Dell", "Intel i3", 8, 512, false, 289.00);
		colin2.addComputer(c12);
		colin2.addComputer(c22);
		colin2.addComputer(c32);
		colin2.addComputer(c42);
		System.out.println(colin2);
		colin2.removeComputer(0);
		colin2.removeComputer(1);
		System.out.println(colin2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice