package assignment01;

public class SimpleDate {
	private int year;
	private int month;
	private int day;
	
	public static SimpleDate of(int yr, int m, int d) {
		SimpleDate returnValue = new SimpleDate();
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;
		return returnValue;
	}
	
	public boolean before(SimpleDate other) {
		if(year < other.year) {
			return true;
		} else if(year == other.year) {
			if(month < other.month) {
				return true;
			} else if(month == other.month) {
				if(day < other.day) {
					return true;
				}
			}
		}
		return false;
	}
}