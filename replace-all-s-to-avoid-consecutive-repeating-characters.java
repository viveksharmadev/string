// https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
class Solution {
    // tc -> n, sc-> n
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        for(int i=0; i<s.length(); i++){            
            
            if(arr[i]!='?') continue;
            
            for(char c='a'; c<='z'; c++){
                if(i>0 && arr[i-1]==c) continue;
                if(i<s.length()-1 && arr[i+1]==c) continue;
                
                arr[i] = c;                
                break;
            }
            
        }
        
        return new String(arr);
    }
}
