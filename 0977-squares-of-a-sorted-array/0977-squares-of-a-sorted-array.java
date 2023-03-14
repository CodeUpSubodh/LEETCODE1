class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0, right=nums.length-1;
        int ans[]= new int[nums.length];
        int k=nums.length-1;
        while(left<=right){
            int max=(Math.abs(nums[left])<Math.abs(nums[right])? nums[right]: nums[left]);
            if(max==nums[right])
                right--;
                else 
                    left++;
            ans[k]=max*max;
            k--;
        }
        return ans;
    }
}