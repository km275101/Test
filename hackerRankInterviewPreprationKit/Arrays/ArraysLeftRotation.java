package Arrays;

public class ArraysLeftRotation {
	
	 static int[] rotLeft(int[] a, int d) {
		 
		 int l = a.length;
		 int[] b = new int[l];
		 for(int i =1 ; i <= l; i ++) {
			 if(i + d <= l) {
				 System.out.print(a[i+d-1]);
				 b[i-1] = a[i+d-1];
			 }else {
				 System.out.print(a[(i+d-1)%l]);
				 b[i-1] = a[(i+d-1)%l];
			 }
			 
			 
		 }
		 return b;
	    }

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		rotLeft(a, 2);
	}

}
