class Solution {
    public String reverseWords(String s) {
        String[] word=s.split(" ");
        char ch;
        String nstr="",fina="";
        for(int i=0;i<word.length;i++)
        {
            for(int j=0;j<word[i].length();j++)
            {
                ch=word[i].charAt(j);
                nstr=ch+nstr;
            }
            word[i]=nstr;
            nstr="";
            
        }
        for(int k=0;k<word.length;k++)
        {
            if(k==word.length-1)
            {
                fina+=word[k];
            }
            else
            {
                fina+=word[k]+" ";
            }
        }
        return fina;
        
        
    }
}