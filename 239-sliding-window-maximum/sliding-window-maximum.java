class Pair{
    int key;
    int val;
    public Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] out = new int[n-k+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.val - a.val);

        for(int i = 0; i < n; i++){
            pq.add(new Pair(i, nums[i]));
            if(i >= k-1 ){
                while(pq.peek().key <= i-k){
                    pq.poll();
                }
                out[i+1-k] = pq.peek().val;
            }
        }
        return out;
    }
}