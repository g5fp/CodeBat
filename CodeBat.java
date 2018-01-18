package codebat;
// Class for Code Bat examples
public class CodeBat {

//	boolean bool;
//	String str;
//	int num;
//	String[] array;
	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if (aSmile == true && bSmile== true){
		    return true;
		  }
		  if (aSmile == false && bSmile == false){
		    return true;
		      }
		    if (aSmile == true && bSmile == false){
		    return false;
		      }
		    return false;
		}
	public int sumDouble(int a, int b) {
		  if (a==b){
		    return (a+b)*2;
		  }
		  return a+b;
		}
	
	
}
