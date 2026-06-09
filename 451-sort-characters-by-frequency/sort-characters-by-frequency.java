class Pair{
    char key;
    int val;
    Pair(char key, int val){
        this.key = key;
        this.val = val;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.val - a.val);
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(char ch : map.keySet()){
            pq.add(new Pair(ch, map.get(ch)));
        }
        String ans = "";
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            for(int i = 0; i < p.val; i++){
                ans += p.key;
            }
        }
        return ans;

    }
}