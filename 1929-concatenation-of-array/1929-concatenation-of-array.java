class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] main=new int[nums.length*2];
        for(int i=0;i<=nums.length*2-1;i++)
        {
            if(i<nums.length)
            {
                main[i]=nums[i];
            }
            else if(i>=nums.length)
            {   
                
                main[i]=nums[i%nums.length];
                
            }
        }
        return main;
        
    }
}