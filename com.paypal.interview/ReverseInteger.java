package pal;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(12435788));
    }

    public static int reverse(int input) {
        int reversedNum = 0;
        for (int i = input; i !=0; i /= 10) {
            reversedNum = reversedNum * 10 + i % 10;
        }
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        return reversedNum;
    }
}
