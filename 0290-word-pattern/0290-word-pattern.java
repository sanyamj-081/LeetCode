// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         String[] arrOfStr = s.split(" ");
//         if(arrOfStr.length != pattern.length())
//             return false;
        
//         HashMap<Character, Integer> pp = new HashMap<>();
//         HashMap<String, Integer> ss = new HashMap<>();
        
//         for(int i=0;i<pattern.length();i++) {
//             if(!pp.containsKey(pattern.charAt(i)))
//                 pp.put(pattern.charAt(i),i);

//             if(!ss.containsKey(arrOfStr[i]))
//                 ss.put(arrOfStr[i],i);
            
//             if(ss.get(arrOfStr[i]) != pp.get(pattern.charAt(i)))
//                 return false;
                
//         }
//         return true;
        
//     }
// }

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arrOfStr = s.split(" ");
        if (arrOfStr.length != pattern.length())
            return false;
        
        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arrOfStr[i];
            
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false;
                }
                charToWord.put(c, word);
                usedWords.add(word);
            }
        }
        return true;
    }
}
