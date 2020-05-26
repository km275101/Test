package Sorting;
/**
 Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some.
 There are a number of different toys lying in front of him, tagged with their prices. 
 Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money.
*/

public class MarkandToys {

	
	static void maxToys(int[] p, int n) {
		int l = p.length;
		int sum = 0;
		int count =0;
		
		//We can also use Arrays.Sort to sort the integer type arrays instead of the bubble sort approach
		//this will give the better time execution performance
		for (int i = 0; i < l - 1; i++) {
			
			for (int j = 0; j < l - i - 1; j++) {
				if (p[j] > p[j + 1]) {

					int temp = p[j];
					p[j] = p[j + 1];
					p[j + 1] = temp;

				}
			}

		}
		for(int i=0; i<l-1; i++) {
			sum = sum + p[i];
			if(sum<=n) {
				
				count ++;
			}
		}
		
		System.out.println("He can bought total number of :"+count);

	}

	public static void main(String args[]) {
		
		int[] a = {1, 12, 5 ,111, 200, 1000, 10};
		maxToys(a, 50);
		
	}

}
