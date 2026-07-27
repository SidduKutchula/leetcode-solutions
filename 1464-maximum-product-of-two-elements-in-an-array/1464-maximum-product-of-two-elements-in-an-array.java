class Solution {
    public int maxProduct(int[] nums) {
        int c=0 , d=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > c){
                d=c;
                c=nums[i];
            }
            else if(nums[i] > d){
                d=nums[i];
            }
        }
        return (c-1)*(d-1);
    }
}