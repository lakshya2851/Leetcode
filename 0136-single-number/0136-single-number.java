class Solution {
    public int singleNumber(int[] nums) {
        int uniqEle=0;
        for(int i=0;i<nums.length;i++){
            uniqEle=uniqEle^nums[i];
        }
        return uniqEle;
    }
}

