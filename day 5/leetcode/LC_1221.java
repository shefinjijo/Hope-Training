class LC_1221 {
    public int balancedStringSplit(String s) {
        int cnt=0, res=0;
        for(char i:s.toCharArray()){
            if(i=='R') cnt++;
            else cnt--;
            if(cnt ==0) res+=1;
        }
        return res;
    }
}