package project_1;

public class DayHelper {
	static int getDayNumber(String userDay) {
		
		// This method will take the userDay input string and have a variable set as an integer.
		int dayNumber = 0;
		
		switch (userDay) {
		case "sun":
			dayNumber = 0;
			break;
			
		case "mon":
			dayNumber = 1;
			break;
			
		case "tue":
			dayNumber = 2;
			break;
			
		case "wed":
			dayNumber = 3;
			break;
			
		case "thu":
			dayNumber = 4;
			break;
			
		case "fri":
			dayNumber = 5;
			break;
			
		case "sat":
			dayNumber = 6;
			break;
		}
		return dayNumber;
	}
}
