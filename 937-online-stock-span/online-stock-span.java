class Pair{
    int key;
    int val;
    Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class StockSpanner {
    Stack<Pair> st;
    int index;
    public StockSpanner() {
        index = 0;
        st = new Stack<>();
    }
    
    public int next(int price) {

        index++;
        while(!st.isEmpty() && st.peek().val <= price){
            st.pop();
        }
        int ans = index;
        if(!st.isEmpty()) ans = index - st.peek().key;
        st.push(new Pair(index, price));
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */