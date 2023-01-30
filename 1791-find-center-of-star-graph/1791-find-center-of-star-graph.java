class Solution {
    public int findCenter(int[][] edges) {
        int size=edges.length+1;
        int[] array=new int[size+1];
        for(int[] edge :edges)
        {
            int x =edge[0];
            int y=edge[1];
            array[x]++;
            array[y]++;
            
        if(array[x]>1)
        {
            return x;
            }
        if(array[y]>1)
        {
            return y;
        }
        }
        return 0;
    
        
            
        
        
    }
}