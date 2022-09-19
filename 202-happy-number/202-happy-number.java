class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> memo=new HashSet<Integer>();
        int res=0;
        while(!memo.contains(n))
        {
            memo.add(n);
        
        res=0;
        while(n>0)
        {
            res+=Math.pow(n%10,2);
            n=n/10;
        }
        n=res;
        if(n==1)
            return true;
        }
        return false;
        
    }
}