class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        // For each index i, look at the next n-1 elements (wrap using modulo)
        for (int i = 0; i < n; i++) {
            nge[i] = -1; // default if no greater element found
            // check elements to the right, wrapping around
            for (int step = 1; step < n; step++) {
                int idx = (i + step) % n;
                if (nums[idx] > nums[i]) {
                    nge[i] = nums[idx];
                    break; // found the first greater element
                }
            }
        }
        return nge;
    }
}