package pal;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("hello".toCharArray()));
    }

    public static String reverse(char[] chars) {
        if (chars.length == 0) {
            throw new IllegalArgumentException();
        }
        String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        return reverse;
    }
}
