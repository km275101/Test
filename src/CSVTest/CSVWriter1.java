package CSVTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opencsv.*;

public class CSVWriter1 {
	
	
	public static void csvWriter() {
		String filePath = "C:\\Users\\kamlesh.maurya\\Desktop\\Jmeter\\Test.csv";
		File file = new File(filePath);
		try { 
			String[] csv1 = {"a","b"};
	        // create FileWriter object with file as parameter 
	        FileWriter outputfile = new FileWriter(file); 
	        CSVWriter writer = new CSVWriter(outputfile);
	        
	        List<String[]> data = new ArrayList<String[]>(); 
	        data.add(new String[] { "\"Name\"", "\"Class\"", "\"Marks\"" });
	        writer.writeAll(data);
	        
	        writer.close(); 
	    } 
	    catch (IOException e) { 
	        // TODO Auto-generated catch block 
	        e.printStackTrace(); 
	    }
		
		
	}
	
	public static void regexTest() {
		
		try {
			String value = "iniit";
		
			Scanner fileScanner = new Scanner(new File("C:\\Users\\kamlesh.maurya\\Desktop\\Jmeter\\text.txt"));
			int lineID = 0;
			  List lineNumbers = new ArrayList();
			  Pattern pattern =  Pattern.compile("(\\d{15})");
			  Matcher matcher = null;
			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				lineID++;
				matcher = pattern.matcher(line);
				if(matcher.find()){
				  value = matcher.group();
				  System.out.println(value);
				  break;
				}
				//System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void writeIntoCSV() throws IOException {
		File f = new File("C:\\Users\\kamlesh.maurya\\Desktop\\Jmeter\\newTest.csv");
		//PrintWriter pw = new PrintWriter(f);
		//pw.close();
		FileWriter fw = new FileWriter(f,false);
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append(",");
		sb.append("adf");
		sb.append(",");
		sb.append("adf");
		fw.write(sb.toString());
		fw.close();
		
			
	}
	
	public static void main(String args[]) throws IOException {
		//csvWriter();
		//regexTest();
		writeIntoCSV();
	}

}
