// https://leetcode.com/problems/reverse-vowels-of-a-string/
class reverse-vowels-of-a-string {
    // tc -> n, sc-> n
    public String reverseVowels(String s) {
        //String vowels = "aeiouAEIOU";
        Set<Character> vowelsSet = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int start = 0, end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start < end){
            if(!vowelsSet.contains(arr[start])){
                start++;
            }
            while(start < end && !vowelsSet.contains(arr[end])){
                end--;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return new String(arr);
    }
    
    // Using String than Set
    // tc -> n, sc-> n
    public String reverseVowels(String s) {
        //String vowels = "aeiouAEIOU";
        Set<Character> vowelsSet = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int start = 0, end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start < end){
            while(start < end && !vowelsSet.contains(arr[start])){
                start++;
            }
            while(start < end && !vowelsSet.contains(arr[end])){
                end--;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return new String(arr);
}

 // tc -> n, sc-> n
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int start = 0, end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start < end){
            while(start < end && !vowels.contains(arr[start]+"")){
                start++;
            }
            while(start < end && !vowels.contains(arr[end]+"")){
                end--;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return new String(arr);
    }
}
