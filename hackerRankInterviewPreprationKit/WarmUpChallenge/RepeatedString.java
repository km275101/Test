package WarmUpChallenge;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {

	
    
    static long repeatedString(String s, long n) {
    	int count= 0;
    	StringBuilder sb = new StringBuilder(s);
		while(sb.length() <= n)
		{
			sb.append(sb);
		}
		String s1 = sb.substring(0, (int) n);
		
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher(s1);
		
		while(m.find()) {
			count++;
		}
		return count;


    }

    
    static long m1(String s, long n) {
    	long a=0;
    	for(int i=0;i<s.length();i++)
    	{
    	if(s.charAt(i)=='a')
    	a++;
    	}
    	long t=a*(n/s.length());
    	long diff=n%s.length();
    	for(int i=0;i<diff;i++)
    	{ 
    	char ch = s.charAt(i);
    	if(ch=='a')
    	t++;
    	}
    	return(t);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = m1(s, n);

        
        System.out.println(result);
        scanner.close();
    }

}
