class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=0;
        for(int i=2;i<=1000;i++)
        {
            if(i%2==0 && i%n==0)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}