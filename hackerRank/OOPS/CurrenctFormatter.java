package OOPS;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrenctFormatter {
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale localeUS = Locale.US;
        Locale localeInd = new Locale("en", "IN");
        Locale localeChina = Locale.CHINA;
        Locale localeFrance = Locale.FRANCE;
        
        

       String us = NumberFormat.getCurrencyInstance(localeUS).format(payment);
       String india = NumberFormat.getCurrencyInstance(localeInd).format(payment);
       String china1 = NumberFormat.getCurrencyInstance(localeChina).format(payment);
       String france1 = NumberFormat.getCurrencyInstance(localeFrance).format(payment);
       
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china1);
        System.out.println("France: " + france1);
    }
}
