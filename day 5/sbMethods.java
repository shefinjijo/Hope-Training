class sbMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, ",");
        System.out.println(sb);

        sb.replace(0, 5, "Hi");
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        sb.setCharAt(0, 'X');
        System.out.println(sb);

        System.out.println(sb.charAt(1));

        System.out.println(sb.substring(1, 4));

        sb.setLength(5);
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Java");
        System.out.println(sb2);

        System.out.println(sb2.indexOf("a"));
        System.out.println(sb2.lastIndexOf("a"));
    }
}