class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i < n; i++){
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> {
            int val = map.get(a) - map.get(b);;
            if(val != 0) return val;
            return b.compareTo(a);
        });
        for(String str : map.keySet()){
            pq.add(str);
            while(pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;

    }
}