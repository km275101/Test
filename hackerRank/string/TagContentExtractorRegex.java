package string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractorRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean match =false;
		int testCases = Integer.parseInt(in.nextLine());
		
		while (testCases > 0) {
			String line = in.nextLine();
			//<(.+)>.+</\\1>
			Pattern p = Pattern.compile("<(.+)>(.+)</\\1>");
			Matcher m = p.matcher(line);

			while(m.find()) {
				System.out.println(m.group(2));
				match = true;
			} 
			if(!match) {
				System.out.println("None");
			}
		}
		testCases--;
		in.close();
	}

}
