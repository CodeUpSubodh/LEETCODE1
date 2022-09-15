class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int start=1;
        for(int i=0;i<n/2;i++){
            arr[i] = start*-1;
            arr[n-i-1] = start;
            start++;
        }
        return arr;
        
    }
}