package Operators;

import java.util.Scanner;

public class EOF {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = 0;
        while(scan.hasNext()) {
        	String s = scan.nextLine();
        	System.out.println(++l+" "+s);
        }
    }
    }
