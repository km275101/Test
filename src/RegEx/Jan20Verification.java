package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Jan20Verification {
	
	// verify first 3 letters as alphabets and last 2 are digits
	
	  static void regeXTest(String s){
		
		  String[] sb = s.split("-");
		  String MON = sb[0];
		  String YY = sb[1];
		  
		  Pattern p = Pattern.compile("^[a-zA-Z]{3}$");
		  Matcher m = p.matcher(MON);
		  if(m.find()) {
			  System.out.println("Month has exactly 3 char :"+m.group());
		  }else {
			  System.out.println("Insert Assert");
			  //assert.fail
		  }
		  
		  Pattern p1 = Pattern.compile("^[\\d]{2}$");
		  Matcher m1 = p1.matcher(YY);
		  if(m1.find()) {
			  System.out.println("YY has exactly 3 digit :"+m1.group());
		  }else {
			  System.out.println("Insert Assert");
			  //assert.fail
		  }
		
	
	}

	public static void main(String[] args) {
		regeXTest("JAN-20");

	}

}
