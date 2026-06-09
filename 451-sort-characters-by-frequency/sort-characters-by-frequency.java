class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character>[] bucket = new List[n+1];
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(ch);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = n; i >= 0; i--){
            if(bucket[i] != null){
                for(char ch : bucket[i]){
                    for(int j = 0; j < i; j++){
                    ans.append(ch);
                    }
                }
            }
        }
        return ans.toString();
    }
}