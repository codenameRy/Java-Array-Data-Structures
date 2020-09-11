//Max Consecutive Ones

//Given a binary array, find the maximum number of consecutive 1s in this array.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // keep track of how many 1's you've seen in a row.
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // Do something with element nums[i].
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            }else {
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] input = { 1, 1, 1, 1, 0, 1, 1, 1 }; // 4
        System.out.println(new Solution().findMaxConsecutiveOnes(input));
       }
}

