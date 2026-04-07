class LC_6 {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] sb = new StringBuilder[numRows];
        
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int curRow = 0;
        boolean flag = false;

        for (char c : s.toCharArray()) {
            sb[curRow].append(c);

            if (curRow == 0 || curRow == numRows - 1) {
                flag = !flag;
            }

            curRow += flag ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : sb) {
            res.append(row);
        }

        return res.toString();

    }
    public static void main(String[] args) {
        
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}