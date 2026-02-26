class Pair{
    int key;
    int val;
    Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] output = new int[nums.length - k + 1];
        Deque<Pair> dq = new ArrayDeque<>();

        for(int i = 0;i < nums.length; i++){
            if(!dq.isEmpty() && dq.peekFirst().key <= i-k ) dq.removeFirst();

            while(!dq.isEmpty() && dq.peekLast().val <= nums[i]) dq.pollLast();

            dq.addLast(new Pair(i, nums[i]));

            if(i >= k-1) output[i+1-k] = dq.peekFirst().val;
        }


        return output;
    }
}