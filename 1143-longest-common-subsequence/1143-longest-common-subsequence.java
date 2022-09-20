class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] array1=text1.toCharArray();
        char[] array2=text2.toCharArray();
        int [][] temp =new int[array1.length+1][array2.length+1];
        int max=0;
        for(int i=1;i<temp.length;i++)
        {
            for(int j=1;j<temp[0].length;j++)
            {
                if(array1[i-1]==array2[j-1])
                {
                    temp[i][j]=temp[i-1][j-1]+1;

                }
                else
                {
                    temp[i][j]=Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j]>max)
                {
                    max=temp[i][j];
                }
            }
        }
        return max;
        
    }
}