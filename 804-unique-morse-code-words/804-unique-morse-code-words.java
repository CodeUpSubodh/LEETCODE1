class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] ar={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> memo=new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            String sr="";
            for(int j=0;j<words[i].length();j++)
            {
                sr += ar[words[i].charAt(j)-'a'];
            }
            memo.add(sr);
        }
        return memo.size();
        
    }
}