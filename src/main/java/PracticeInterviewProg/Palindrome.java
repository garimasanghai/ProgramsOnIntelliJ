package PracticeInterviewProg;

public class Palindrome {

	public static void main(String[] args) {
		
		int num =100;
		int orgNum = num;
        int reversedNum = 0;
        
        //logic
        for (int temp = num; temp !=0; temp/=10) {
        	int lastNum = temp %10;
        	reversedNum = reversedNum*10+lastNum;		
        	
        }

        if(orgNum == reversedNum) {
        	System.out.println(" is a palindrome");
        }
        else {
        	System.out.println("not a palindrome");
        }
	}

}
