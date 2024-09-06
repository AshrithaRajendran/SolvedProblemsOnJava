package NewProblems;
import java.util.Scanner;

public class CandidateSelection {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the details
        System.out.print("Enter 10th mark percentage: ");
        double tenthMark = scanner.nextDouble();
        
        System.out.print("Enter 12th mark percentage: ");
        double twelfthMark = scanner.nextDouble();
        
        System.out.print("Enter CGPA: ");
        double  CGPA= scanner.nextDouble();
        
        System.out.print("Enter proficiency (Java/C++): ");
        String proficiency = scanner.next();

        // Determine if the candidate is selected or rejected
        String result = evaluateCandidate(tenthMark, twelfthMark, CGPA, proficiency);
        System.out.println("Candidate is " + result);

        scanner.close();
    }

    public static String evaluateCandidate(double tenthMark, double twelfthMark, double CGPA, String proficiency) {
        if ((tenthMark > 80 && twelfthMark > 80 && CGPA > 8 && proficiency.equalsIgnoreCase("Java")) ||
            (tenthMark > 85 && twelfthMark > 85 && CGPA >= 8.5 && proficiency.equalsIgnoreCase("C++"))) {
            return "Selected";
        } else {
            return "Rejected";
        }
    }
}
