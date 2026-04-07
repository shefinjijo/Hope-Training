public class AllWrapperClassesDemo {

    public static void main(String[] args) {

        byte b = 1;
        Byte objByte = Byte.valueOf(b);

        short s = 2;
        Short objShort = Short.valueOf(s);

        int i = 10;
        Integer objInt = Integer.valueOf(i);

        long l = 100L;
        Long objLong = Long.valueOf(l);

        float f = 10.5f;
        Float objFloat = Float.valueOf(f);

        double d = 20.99;
        Double objDouble = Double.valueOf(d);

        char c = 'A';
        Character objChar = Character.valueOf(c);

        boolean bool = true;
        Boolean objBool = Boolean.valueOf(bool);

        System.out.println("=== After Manual Boxing ===");
        System.out.println(objByte);
        System.out.println(objShort);
        System.out.println(objInt);
        System.out.println(objLong);
        System.out.println(objFloat);
        System.out.println(objDouble);
        System.out.println(objChar);
        System.out.println(objBool);

        byte b2 = objByte.byteValue();
        short s2 = objShort.shortValue();
        int i2 = objInt.intValue();
        long l2 = objLong.longValue();
        float f2 = objFloat.floatValue();
        double d2 = objDouble.doubleValue();
        char c2 = objChar.charValue();
        boolean bool2 = objBool.booleanValue();

        System.out.println("\n=== After Manual Unboxing ===");
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);
        System.out.println(c2);
        System.out.println(bool2);
    }
}