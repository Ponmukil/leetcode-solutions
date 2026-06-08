class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sTot = new HashMap<>();
        HashMap<Character, Character> tTos = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            if(sTot.containsKey(s1)){
                if(sTot.get(s1) == s2) continue;
                return false;
            }
            if(tTos.containsKey(s2)){
                if(tTos.get(s2) == s1) continue;
                return false;
            }
            sTot.put(s1,s2);
            tTos.put(s2,s1);

        }
        return true;
    }
}