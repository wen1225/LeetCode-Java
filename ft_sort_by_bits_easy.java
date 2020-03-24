import java.util.Arrays;
import java.util.Comparator;

class Solution {    
    public int[] sortByBits(int[] arr) {
        if (arr.length < 1 || arr.length > 500)
            return null;
        else{
            //sort arr first
            Arrays.sort(arr);
            //create 2D array and 
            //populate table with bitCount and its decimal equivalent
            int[][] table = new int[arr.length][2];
            for (int i = 0; i < arr.length; i++){
                table[i][0] = Integer.bitCount(arr[i]);
                table[i][1] = arr[i];
            }
            Arrays.sort(table, Comparator.comparing(a -> a[0]));
            for (int i = 0; i < arr.length; i++){
                arr[i] = table[i][1];
            }
            return arr;
        }
    }
}
