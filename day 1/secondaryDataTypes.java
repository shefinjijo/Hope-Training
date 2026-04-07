public class secondaryDataTypes {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        for(int i:nums){
            System.out.println(i);
        }
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 +" " + s2);
        System.out.println(s1 == s2);
        String s3 = new String();
        String s4 = new String();
        s3 = "Hello";
        s4 = "Hello";
        System.out.println(s3 + " " + s4);
        System.out.println(s3 == s4);
    }
}
