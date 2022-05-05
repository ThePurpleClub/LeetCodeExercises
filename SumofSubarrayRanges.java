//2104. Sum of Subarray Ranges

class Solution {
    public long subArrayRanges(int[] nums) {
       
        long sum = 0;
        
        for(int i = 0; i<nums.length; i++){
                int min = nums[i];
                int max = nums[i];
            for(int j = i; j<nums.length; j++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                int diff = max - min;
                sum += diff;
            }
        }
        return sum;
    }
}
