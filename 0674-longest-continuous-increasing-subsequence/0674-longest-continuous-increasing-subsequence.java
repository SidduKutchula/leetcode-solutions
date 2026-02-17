class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int ans = 1;
        int count = 1;

        for(int i = 0; i < n - 1; i++){
            if(nums[i] < nums[i + 1]){
                count++;
                ans = Math.max(ans, count);
            }
            else{
                count = 1;
            }

           
        }
        
        return ans;
    }
}