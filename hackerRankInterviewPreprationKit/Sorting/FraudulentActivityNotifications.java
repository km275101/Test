package Sorting;

import java.util.Arrays;

public class FraudulentActivityNotifications {
	
	
	 static int activityNotifications(int[] expenditure, int d) {
		 int notice = 0 ;
		 float median ;
		 int module = d%2;
		 int length = expenditure.length;
		 if(length <= d) {
			 
			 return notice;
		 }
		 int k =0 ;
		 if(module == 0) {
			 
			 
				 for(int j = 0; j < length-d; j++) {
					
					 int[] temp = Arrays.copyOfRange(expenditure, j, d+j);
					
					 Arrays.sort(temp);
					 int middle = temp.length/2;
					 median = (float) ((temp[middle-1]+temp[middle])/2.0); 
					 
					 
					 if( expenditure[temp.length+k]>= 2*median ) {
						 notice++;
					 }
					 k++;
					 
					
			 }
			 
		 }else {
			 for(int j = 0; j < length-d; j++) {
				 int[] temp = Arrays.copyOfRange(expenditure, j, d+j);
				 Arrays.sort(temp);
				 int middle = temp.length/2;
				 median = (float) ((temp[middle])); 
				 
				 if( expenditure[temp.length+k]>= 2*median ) {
					 notice++;
				 }
				 k++;
				
		 }
		 }
		 
		return notice;


	    }

	public static void main(String[] args) {
		int[] ex = {2, 3, 4, 2, 3, 6, 8, 4, 5};
		
		int a = activityNotifications(ex, 5);
		System.out.println(a);

	}

}
