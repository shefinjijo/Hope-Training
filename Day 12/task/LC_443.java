class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;

        int i = 0;
        while (i < n) {
            char curr = chars[i];
            int count = 0;
            while (i < n && chars[i] == curr) {
                i++;
                count++;
            }
            chars[idx++] = curr;
            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[idx++] = c;
                }
            }
        }
        return idx;
    }
}