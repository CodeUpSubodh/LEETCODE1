class Solution {
public String digitSum(String s, int k) {
    if(s.length() <= k)
        return s;
    
    while(s.length() > k){
        String temp = "";
        for(int i = 0; i < s.length(); i += k){
            int curSum = 0;
            for(int j = 0; j < k && (j + i) < s.length(); j++){
                curSum += s.charAt(i + j) - '0';
            }
            temp += curSum +"";
        }
        s = temp;
    }
    
    return s;
}
}