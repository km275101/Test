package string;
public class ScoreOfString {

    public static int scoreOfString(String s) {

        char[] ch = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < ch.length-1; i++) {

            sum = sum +  Math.abs((int) ch[i] - (int) ch[i+1]) ;

        }
        return  sum;
    }

    public static void main (String args[]){
            System.out.println(scoreOfString("hello"));
    }

}

/***
 * You are given a string s.
 * The score of a string is defined as the sum of the absolute difference between the ASCII values
 * of adjacent characters.
 *
 * Example 1:
 * Input: s = "hello"
 * Output: 13
 * Explanation:
 * The ASCII values of the characters in s are:
 * 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111.
 * So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
 * */
