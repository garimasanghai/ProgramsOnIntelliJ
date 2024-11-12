package PracticeInterviewProg;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8,13,21,34

		int num = 10;
		int firstTerm = 0;
		int secondTerm = 1;

		// System.out.println("Fibo seriers till " + num + " terms : ");

		for (int i = 1; i <= num; i++) {
			System.out.println(firstTerm);

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
