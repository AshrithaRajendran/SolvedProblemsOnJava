package NewProblems;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDays {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Input the first date
	        System.out.print("Enter the first date (dd MMM yyyy): ");
	        String date1 = scanner.nextLine();
	        
	        // Input the second date
	        System.out.print("Enter the second date (dd MMM yyyy): ");
	        String date2 = scanner.nextLine();

	        // Parse the dates
	        LocalDate startDate = LocalDate.parse(date1, java.time.format.DateTimeFormatter.ofPattern("dd MMM yyyy"));
	        LocalDate endDate = LocalDate.parse(date2, java.time.format.DateTimeFormatter.ofPattern("dd MMM yyyy"));

	        // Calculate the number of days between the two dates
	        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

	        // Print the result
	        System.out.println("Number of days: " + daysBetween);

	        scanner.close();
	    }
	}


