package week05;

import java.util.Arrays;

public class StringUtil {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }

    public static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
 
    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static String mixed(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            char temp = chars[0];
            chars[0] = chars[chars.length - 1];
            chars[chars.length - 1] = temp;  
            arr[i] = new String(chars);
        }
        return String.join(" ", arr);

        // for (int i = 0; i < sb.length(); i++) if (sb.charAt(i) != ' ') {
        //     int j = i;
        //     while (j < sb.length() && sb.charAt(j) != ' ') {
        //         j++;
        //     }
        //     -- j;
        //     char temp = sb.charAt(i);
        //     sb.setCharAt(i, sb.charAt(j));
        //     sb.setCharAt(j, temp);
        //     i = j;
        // }
        // return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(reverse(s1));

        String s2 = "Baku";
        System.out.println(explode(s2));

        String s3 = "Baku";
        System.out.println(sort(s3));

        String s4 = "listen";
        String s5 = "silent";
        System.out.println(anagram(s4, s5));

        String s6 = "This is PP2 Fall 2021";
        System.out.println(mixed(s6));
    }
}