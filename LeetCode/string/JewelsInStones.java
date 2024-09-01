package string;

public class JewelsInStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int sum = 0;

        for (int i =0; i < jewels.length(); i ++ ){

            for (int j =0; j < stones.length(); j ++ ){
                if( (stones.charAt(j) == jewels.charAt(i))){
                    sum = sum +1;
                }
            }
        }

        return sum;

    }

    public static void main (String args[]){

        System.out.println(numJewelsInStones("aA", "aAAbbbb"));

    }

}

