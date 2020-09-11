import java.util.Arrays;

//Squares of Sorted Array

//Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

class SortedSquares {
    public int[] sortedSquares(final int[] A) {
        // create a new primitive int array
        int[] res = new int[A.length];
        // loop through the input array
        for (int i = 0; i < A.length; i++) {
            // square each value
            res[i] = A[i] * A[i];
        }
         // finally sort the array
        Arrays.sort(res);
        return res;
    }


    public static void main(String[] args) {
    int[] input = { -4,-1,0,3,10 }; // [0,1,9,16,100]
    System.out.println(new SortedSquares().sortedSquares(input));
   }
}

// public static void main(String[] args) {
//     int[] input = { 1, 1, 1, 1, 0, 1, 1, 1 }; // 4
//     System.out.println(new Solution().findMaxConsecutiveOnes(input));
//    }