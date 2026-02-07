class Solution {

    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);

        // Step 1: flip all negative numbers first
        for(int i = 0; i < nums.length && k > 0; i++) {
            if(nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        // Step 2: sort again because values changed
        Arrays.sort(nums);

        // Step 3: if k is odd, flip smallest element
        if(k % 2 == 1) {
            nums[0] = -nums[0];
        }

        // Step 4: calculate sum
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        return sum;
    }
}