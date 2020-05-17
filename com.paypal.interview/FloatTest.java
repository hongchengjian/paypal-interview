package pal;

import java.math.BigDecimal;

public class FloatTest {

    public static void main(String[] args) {
        float a = 0.1f;
        float b = 0.1f;
        float c = 0.1f;

        float d = a + b + c;
        float e = d * 3;
        float f = d * 100000;

        // 原题是静度丢失
        BigDecimal a1 = new BigDecimal(Float.toString(a));
        BigDecimal b1 = new BigDecimal(Float.toString(b));
        BigDecimal c1 = new BigDecimal(Float.toString(c));
        float d1 = a1.add(b1).add(c1).floatValue();
        BigDecimal d2 = new BigDecimal(Float.toString(d1));
        float e1 = d2.multiply(new BigDecimal("3")).floatValue();
        float f1 = d2.multiply(new BigDecimal("100000")).floatValue();

        System.out.println("a + b + c = d = " + d1);
        System.out.println("e = "+ e1);
        System.out.println("f = " + f1);
    }
}
