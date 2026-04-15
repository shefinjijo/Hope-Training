class LC_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int tb=numBottles;
        while(numBottles>=numExchange){
            tb+=numBottles/numExchange;
            numBottles=(numBottles/numExchange)+(numBottles%numExchange);
        }
        return tb;
    }
}