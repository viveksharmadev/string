// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class Solution {
    // tc -> 2n, sc-> 2n
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder sb1 = new StringBuilder();        
        for(String word : word1){
            sb1.append(word);
        }
        
        StringBuilder sb2 = new StringBuilder();        
        for(String word : word2){
            sb2.append(word);
        }
        
        return sb1.toString().equals(sb2.toString());
    }
}

class Solution {
    // tc -> n, sc-> 1
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int arr1Index = 0, arr2Index = 0, i = 0, j = 0;
        
        while(arr1Index < word1.length && arr2Index < word2.length){
            
            if(word1[arr1Index].charAt(i) != word2[arr2Index].charAt(j)){
                return false;
            }
            
            if(i == word1[arr1Index].length()-1){
                i=0;
                arr1Index++;
            }
            
            else{
                i++;
            }
            
            
            if(j == word2[arr2Index].length()-1){
                j=0;
                arr2Index++;
            }
            
            else{
                j++;
            }
            
        }
        
        return arr1Index == word1.length && arr2Index == word2.length;
    }
}
