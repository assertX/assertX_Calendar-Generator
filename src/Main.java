package project_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Open scanner for user input.
		Scanner scanner = new Scanner(System.in);
		
		// Get user input.
		String days = "Sun Mon Tue Wed Thu Fri Sat";
		System.out.print("Please enter a 4 digit year: ");
		int userYear = scanner.nextInt();
		
		System.out.print("\nPlease enter a 1 or 2 digit month: ");
		int userMonth = scanner.nextInt();
		
		System.out.print("\nPlease enter the day-of-week that the 1st falls on: ");
		String userDay = scanner.next().toLowerCase();
		
		// Calling this method to get the integer of day (0-6).
		int dayNumber = DayHelper.getDayNumber(userDay);
	
		// Calling both methods in order to determine the name of month and the amount of days of that month.
		String monthName = MonthHelper.getMonthName(userMonth);
		int totalDays = MonthHelper.getTotalDays(userMonth, userYear);
			
		// Calculating the amount of space from the left to center the month's name and year.
		int totalSpacing = 27;
		int userYearLength = String.valueOf(userYear).length();
		int leftSpace = ((totalSpacing - (userYearLength + monthName.length() + 1)) / 2);
		
		// This will print the top header then the days. Center Aligned.
		System.out.printf("\n%"+leftSpace + "s%s %s\n", "", monthName, userYear);
		System.out.println(days);
		
		
		// Output of the calendar itself.
		// Loops through to check when the first day of the month will fall under.
		for (int i = 1; i <= dayNumber; i++)
			System.out.print("    ");
		
		// Loops through the total number of days until the new line.
		for (int j = 1; j <= totalDays; j++) {
			if (dayNumber % 7 == 0 && dayNumber != 0)
				System.out.println();
			System.out.printf("%3d ", j);
			dayNumber += 1;
		}
		dayNumber %= 7;
		System.out.print("\n");
			
		// Close scanner.
		scanner.close();
	}
}
