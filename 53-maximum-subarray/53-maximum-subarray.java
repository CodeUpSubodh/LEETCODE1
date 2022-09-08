class Solution {
    public int maxSubArray(int[] nums) {
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        int current=0;
        while(right<nums.length)
        {
            if(current<0 && nums[right]>=current)
            {
                left=right;
                current=0;
            }
            current+=nums[right];
            max=Math.max(max,current);
            right++;
        }
        return max;
        
    }
}