// https://leetcode.com/problems/split-a-string-in-balanced-strings/
class split-a-string-in-balanced-strings {
    // tc -> n, sc-> 1
    public int balancedStringSplit(String s) {
        int count = 0, res = 0;
        for(int i=0; i<s.length(); i++){
            count += s.charAt(i)=='L' ? 1 : -1;
            if(count==0) res += 1;
        }
        return res;
    }
}
