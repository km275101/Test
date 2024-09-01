package string;

public class PermutaionOfTwoString {

    public static int defangIPaddr(String s, String t) {

        char[] ch = s.toCharArray();
        int sum = 0;
        for (Character c : ch){
         sum = sum +  Math.abs(s.indexOf(c) - t.indexOf(c));
        }
        return sum;
    }

    public static void main (String args[]){

        System.out.println(defangIPaddr("abc", "bac"));

    }

}

