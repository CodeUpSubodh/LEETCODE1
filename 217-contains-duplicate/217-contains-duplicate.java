class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        HashSet<Integer> memo=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int currentkey=nums[i];
           if(memo.contains(currentkey))
              {
                  return true;
              }
            memo.add(currentkey);
            
        }
        return false;
        
    }
}