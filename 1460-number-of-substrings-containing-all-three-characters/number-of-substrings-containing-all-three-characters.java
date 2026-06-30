class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer> h = new HashMap<>();
        h.put('a',-1);
        h.put('b',-1);
        h.put('c',-1);
        int count = 0 ;

        for(int i =0 ;i < s.length();i++){
            h.put(s.charAt(i),i);
            if(h.get('a') != -1 && h.get('b') != -1 && h.get('c') != -1){
                int min = Integer.min(h.get('a'), Integer.min(h.get('b'),h.get('c')));
                count = count + min + 1;
            } 
        }
        return count;
    }
}