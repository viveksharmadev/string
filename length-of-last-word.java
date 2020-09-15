https://leetcode.com/problems/length-of-last-word/
class Solution {
    // tc -> n, sc-> 1
    public int lengthOfLastWord(String s) {
        int length = s.length(); 
        
        int lastIndex = length, len = 0;
        
        while(lastIndex-- > 0){
            
            if(s.charAt(lastIndex)!=' '){
                len++;
            }else if(len>0){
                return len;
            }
        }
        
        return len;
    }
}

class Solution {
// tc -> n because of split() method, sc-> 1
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        
        int n = arr.length;
        
        return n>0 ? arr[n-1].length() : 0;
    }
}
