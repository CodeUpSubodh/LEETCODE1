class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] even=new int[nums.length];
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                even[j]=nums[i];
                nums[i]=-2;
                j++;
            }
        }
        Arrays.sort(nums);
        for(int k=j;k<nums.length;k++)
        {
            even[j]=nums[k];
            j++;
        }
        return even;
        
    }
}