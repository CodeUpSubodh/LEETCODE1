class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int or=mat.length;
        int oc=mat[0].length;
        if(or*oc!=r*c)
            return mat;
        int[][] n=new int[r][c];
        for(int i=0;i<or*oc;i++)
        {
            n[i/c][i%c] = mat[i/oc][i%oc];
        }
        return n;
        
    }
}