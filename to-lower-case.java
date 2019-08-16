// https://leetcode.com/problems/to-lower-case/
class Solution {
    // tc -> n, sc-> n
    public String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                arr[i] = (char)(arr[i]-'A'+'a');
            }
        }
        return new String(arr);
    }
}
