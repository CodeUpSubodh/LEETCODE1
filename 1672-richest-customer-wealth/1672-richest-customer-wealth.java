class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=-1;
        int sum=0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[0].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(max<sum)
            {
                max=sum;
                
            }
            sum=0;
            
                
        }
        return max;
    }
}