package File;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileName {
	
	public FileName(){
		
	}
	
	public static void main(String args[]){
		
		String text = "ClassNameOneKamykjhGht839";
		String cleanText = text.replaceAll("[A-Z]", "$1 $2");
		
		
		String s = "abcDefGhi1234skdhH234";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(s);
		
		while(m.find()) {
			System.out.print(m.group());
		}
		
		
		
		File f = new File("C:\\Hello\\AnotherFolder\\The File Name.PDF");
		System.out.println(f.getName());
		
		System.out.println(f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf("\\")+1));
	}

}
