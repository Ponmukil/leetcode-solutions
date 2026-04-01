class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = stones.length;
        for(int i = 0; i < n; i++) pq.offer(stones[i]);
        
        while(pq.size() > 1){
            int max = pq.poll();
            int sec_max = pq.poll(); 
            
            pq.offer(max-sec_max);
        }
        return pq.poll();

    }
}