package project_1;

public class MonthHelper {
	static String getMonthName(int userMonth) {
		
		// This method will receive the userMonth integer input and set a variable for the month's name.
		String month = "";
		
		switch (userMonth) {
		case 1:
			month = "January";
			break;
			
		case 2:
			month = "February";
			break;
			
		case 3:
			month = "March";
			break;
			
		case 4:
			month = "April";
			break;
			
		case 5:
			month = "May";
			break;
			
		case 6:
			month = "June";
			break;
			
		case 7:
			month = "July";
			break;
			
		case 8:
			month = "August";
			break;
			
		case 9:
			month = "September";
			break;
			
		case 10:
			month = "October";
			break;
			
		case 11:
			month = "November";
			break;
			
		case 12:
			month = "December";
			break;
		}
		return month;
	}
		
		static int getTotalDays(int userMonth, int userYear) {
			// This method will take the integer userMonth and userYear to set a integer variable for total days of that month. The year to determine leap year.
			int totalDays = 0;
			
			switch (userMonth) {
			case 1:
				totalDays = 31;
				break;
				
			case 2:
				if ((userYear % 4 == 0 && userYear % 100 != 0) || userYear % 400 == 0)
					totalDays = 29;
				else
					totalDays = 28;
				break;
				
			case 3:
				totalDays = 31;
				break;
				
			case 4:
				totalDays = 30;
				break;
				
			case 5:
				totalDays = 31;
				break;
				
			case 6:
				totalDays = 30;
				break;
				
			case 7:
				totalDays = 31;
				break;
				
			case 8:
				totalDays = 31;
				break;
				
			case 9:
				totalDays = 30;
				break;
				
			case 10:
				totalDays = 31;
				break;
				
			case 11:
				totalDays = 30;
				break;
				
			case 12:
				totalDays = 31;
				break;
			}
			return totalDays;
			
		

	}
}

		
	


