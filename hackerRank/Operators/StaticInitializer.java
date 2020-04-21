package Operators;

import java.util.Scanner;

public class StaticInitializer {
	
	static boolean flag  = false;
	static int B;
	static int H;
	
	static{

		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		int n =2;
		
	    if(B>0 && H>0){
	        flag = true;
	    }else{
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	}

	public static void main(String[] args){
		
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main


}
