// https://leetcode.com/problems/single-row-keyboard/
class single-row-keyboard {
    // tc -> n, sc-> 1
    public int calculateTime(String keyboard, String word) {
        int[] indexMap = new int[26];
        for(int i=0; i<keyboard.length(); i++){
            indexMap[keyboard.charAt(i)-'a'] = i;
        }
        
        int res = 0, last = 0;
        for(int i=0; i<word.length(); i++){
            res += Math.abs(indexMap[word.charAt(i)-'a'] - last);
            last = indexMap[word.charAt(i)-'a'];
        }
        
        return res;
    }
}
