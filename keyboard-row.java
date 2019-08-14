// https://leetcode.com/problems/keyboard-row/
class keyboard-row {
    // tc -> m*n, sc-> m*n  where m  is words length, n is each word length inside words
    public String[] findWords(String[] words) {        
        List<String> res = new ArrayList<>();
        String s1 = "qwertyuiop", s2= "asdfghjkl",
        s3 = "zxcvbnm";
        int count1=0, count2=0, count3=0;
        for(String word : words){
            for(int i=0; i<word.length(); i++){
                if(s1.indexOf(word.toLowerCase().charAt(i))!=-1) count1++;
                if(s2.indexOf(word.toLowerCase().charAt(i))!=-1) count2++;
                if(s3.indexOf(word.toLowerCase().charAt(i))!=-1) count3++;
            }
            if(count1==word.length() || count2==word.length()
              || count3==word.length())
                res.add(word);
            count1=0; count2=0; count3=0;
        }
        return res.toArray(new String[0]);
    }
}
