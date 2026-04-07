public class Autoboxing {
    public static void main(String[] args) {
        // int a=10;
        // Integer objA=a;//Integer.valueOf(a);
        // System.out.println(objA);
        Integer a=127;
        Integer obj=127;
        System.out.println(a==obj);//true
        Integer b=200;
        Integer obj1=200;
        System.out.println(b==obj1);//false
        System.out.println(a.equals(obj));//true
        int val=-128;
        Integer obj2=val;
        System.out.println(obj2);//true
        Character c='z';
        Character d='z';
        System.out.println(c==d);//true
        Float k=127f;
        Float m=127f;
        System.out.println(k.equals(m));//false 
    }
}