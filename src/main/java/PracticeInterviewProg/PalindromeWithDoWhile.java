package PracticeInterviewProg;

public class PalindromeWithDoWhile {

	public static void main(String[] args) {
		
		int num = 222;
		int reversedNum = 0;
		int remainder;
		int temp = num;
	
		while (num!=0) {
			remainder = num%10;
			reversedNum= reversedNum*10+remainder;
			num/=10;
		}
		
		if(temp == reversedNum) {
			System.out.println(" is a palindrome");
		}
		else {
			System.out.println(" not a palindrome");
		}
	}

}
