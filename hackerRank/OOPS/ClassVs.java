package OOPS;

import java.util.Scanner;

public class ClassVs {
	
	 private int age;    
	  
	    public ClassVs(int initialAge) {
	          // Add some more code to run some checks on initialAge
	        if (initialAge >= 0) {
	            age = initialAge;
	        } else {
	            System.out.println("Age is not valid, setting age to 0.");
	            age = 0;
	        }
	    }

	    public void amIOld() {
	        String statement;
	        if (age < 13) {
	            statement = "You are young.";
	        }
	        else if (age < 18) {
	            statement = "You are a teenager.";
	        }
	        else {
	            statement = "You are old.";
	        }
	        // Write code determining if this person's age is old and print the correct statement:
	        System.out.println(statement);
	    }
	    public void yearPasses() {
	          // Increment this person's age.
	        age++;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassVs p = new ClassVs(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
			System.out.println("A");
        }
		sc.close();
    }
}
