class LC_344 {
    public void reverseString(char[] s) {
        int st=0;
        int end=s.length-1;
        while(st<end){
            char temp=s[st];     
            s[st]=s[end];
            s[end]=temp;  
            st++;
            end--;
            }
         
    }
}