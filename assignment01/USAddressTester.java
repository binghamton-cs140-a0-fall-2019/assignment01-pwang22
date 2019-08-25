package assignment01;

public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress a1 = new StreetUSAddress("1835 Magic Dr", "#48", "Pamplico", "SC", "29583");
		StreetUSAddress a2 = new StreetUSAddress("8817 Sand Pine Dr", "", "Navarre", "FL", "32566");
		System.out.println(a1);
		System.out.println(a2);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		StreetUSAddress a12 = new StreetUSAddress("1835 Magic Dr", "#48", "Pamplico", "SC", "29583");
		StreetUSAddress a22 = new StreetUSAddress("8817 Sand Pine Dr", "", "Navarre", "FL", "32566");
		output.println(a12);
		output.println(a22);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}