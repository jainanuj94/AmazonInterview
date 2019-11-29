package main;

/**
 * Given an array with only one unique number
 * Find the unique number
 */
public class SingleNumber {

    public static void main(String[] args) {

        System.out.println(uniqueSingleNumber(new int[] {1, 1, 2, 3, 2}));
    }

    public static int uniqueSingleNumber(int[] arr){
        int result = 0;

        for(int i : arr){
            result ^= i;
        }

        return result;
    }
}
