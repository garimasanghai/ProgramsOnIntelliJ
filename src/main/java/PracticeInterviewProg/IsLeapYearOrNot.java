package PracticeInterviewProg;

public class IsLeapYearOrNot {

	public static void main(String[] args) {
		//Logic: Should be divisible by 400 & 4 bt not by 100
		
		int year = 1900;
		if((year % 400 == 0 || year % 4 == 0 && year % 100!=0)){
			System.out.println(" It is a leap year");
		}
		else {
			System.out.println(" It is not a leap year");
		}

	}

}
