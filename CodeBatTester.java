package codebat;

public class CodeBatTester {

	public static void main(String[] args) {

		CodeBat codebat = new CodeBat();
		boolean result = codebat.monkeyTrouble(true, true);
		System.out.println(result);
		int num = codebat.sumDouble(2, 2);
		System.out.println(num);
		dosomething();
		

	}
	private static void dosomething() {
		System.out.println("I'm doing something");
	}

}
