// https://leetcode.com/problems/remove-vowels-from-a-string/
class remove-vowels-from-a-string {
    // tc -> n, sc-> n
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        set.add('a'); set.add('e'); set.add('i');
        set.add('o'); set.add('u');
        for(int i=0; i<S.length(); i++){
            if(!set.contains(S.charAt(i))){
                sb.append(S.charAt(i)+"");      
            }            
        }
        return sb.toString();
    }
    
    // tc -> n, sc-> n
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();                
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='a' || S.charAt(i)=='e' || S.charAt(i)=='i'
              || S.charAt(i)=='o' || S.charAt(i)=='u'){
                continue;
            }
            sb.append(S.charAt(i)+"");
        }
        return sb.toString();
    }
}
