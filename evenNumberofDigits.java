//Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.
//Constraints:

// 1 <= nums.length <= 500
// 1 <= nums[i] <= 10^5

class EvenNumbers {
    public int findNumbers(int[] nums) {
        int count = 0; //Count the number of even number of digits
        for (int i = 0; i < nums.length; i++) {
            int mem = (int)Math.log10(nums[i]) + 1;
          if (mem % 2 == 0) {
              count++;
          }  
        }
        return count;
    }

    public static void main(String[] args) {
        int[] input = { 12,345,2,6,7896 }; // 2
        System.out.println(new EvenNumbers().findNumbers(input));
       }
}

//Solution 2
/*
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; //Count the number of even number of digits
        for (int num : nums) {
            if(String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
*/