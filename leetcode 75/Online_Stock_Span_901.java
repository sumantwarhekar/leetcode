class StockSpanner {                                                    // https://www.youtube.com/watch?v=jgEF8Dod5KE

    public Stack<Integer> helper;
    public int[] prices;
    public int day;   

    public StockSpanner() {
        helper = new Stack<>();
        prices = new int[100000];
        day=0;
    }
    
    public int next(int price) {
        prices[day] = price;

        while(!helper.isEmpty() && prices[helper.peek()] <= price){
            helper.pop();
        }
        int span;
        if(helper.isEmpty()){
            span = day + 1;
        }
        else{
            span = day - helper.peek();
        }
        helper.push(day);
        day++;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */