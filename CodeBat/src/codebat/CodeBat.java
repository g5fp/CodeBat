package codebat;

// Class for Code Bat examples
public class CodeBat {

	// boolean bool;
	// String str;
	// int num;
	// String[] array;

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile == true && bSmile == true) {
			return true;
		}
		if (aSmile == false && bSmile == false) {
			return true;
		}
		if (aSmile == true && bSmile == false) {
			return false;
		}
		return false;
	}

	public int sumDouble(int a, int b) {
		if (a == b) {
			return (a + b) * 2;
		}
		return a + b;
	}

	public String delDel(String str) {
		if (str.length() < 4) {
			return str;
		}
		if (str.substring(1, 4).equals("del")) {
			str = str.replaceFirst("del", "");

			return str;
		}

		return str;
	}

	public boolean mixStart(String str) {
		if (str.length() < 3)
			return false;

		if (str.substring(1, 3).equals("ix"))
			return true;

		return false;
	}
	public String startOz(String str) {
		String str2="";
		if (str.length()<2) return str;
		if (str.substring(0,1).equals("o")) {
			str2 = str.substring(0,1);
		}
		if (str.substring(1, 2).equals("z")) {
			str2 = str2 + str.substring(1,2);
		}
		
		  return str2;
	}

}
