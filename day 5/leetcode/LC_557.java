class LC_557 {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        String[] str=s.split(" ");
        for(String i:str){
            StringBuilder reverse_word=new StringBuilder(i);
            res.append(reverse_word.reverse()).append(" ");
        }
        return res.toString().trim();
    }
}