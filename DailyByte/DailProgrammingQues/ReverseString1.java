package DailProgrammingQues;

public class ReverseString1 {
	
	public static String m(String s) {
		if(s.length()<=1) return s;
		
		return m(s.substring(1))+s.charAt(0);
		
	}

	public static void main(String[] args) {
		System.out.println(m("ant"));
		System.out.println(m("The Daily Byte"));
		System.out.println(m("civic"));

	}

}
