class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList();
        for(int i=0;i<nums1.length;i++){
            if(search(nums1[i],nums2)){
                if(!list.contains(nums1[i]))list.add(nums1[i]);
            }
        }
        int []arr=new int[list.size()];
        int index=0;
        for(int val:list){
            arr[index++]=val;
        }
        return arr;
    }
    public boolean search(int target,int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)return true;
        }
        return false;
    }
}