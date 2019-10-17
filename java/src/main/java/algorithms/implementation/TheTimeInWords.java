import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheTimeInWords {
    
    static Map<Integer, String> dictionary;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        initDictionary();
        
        int nextHour = 0;
        if (h == 12) {
            nextHour = 1;
        } else {
            nextHour = h + 1;
        }
        
        if (m == 0) {
            System.out.println(dictionary.get(h) + " o' clock");
        } else if (m > 0 && m < 15) {
            
        } else if (m == 15) {
            System.out.println("quarter past " + dictionary.get(h));
        } else if (m > 15 && m < 30) {
            System.out.println(dictionary.get(m) + (m == 1 ? " minute " : " minutes ") + "past " + dictionary.get(h));
        } else if (m == 30) {
            System.out.println("half past " + dictionary.get(h));
        } else if (m > 30 && m < 45) {
            System.out.println(dictionary.get(60-m) + " minutes to " + dictionary.get(nextHour));
        } else if (m == 45) {
            System.out.println("quarter to " + dictionary.get(nextHour));
        }  else if (m > 45 && m < 60) {
            System.out.println(dictionary.get(60-m) + " minutes to " + dictionary.get(nextHour));
        }
    }
    
    private static void initDictionary() {
        dictionary = new HashMap<Integer, String>();
        dictionary.put(1, "one");
        dictionary.put(2, "two");
        dictionary.put(3, "three");
        dictionary.put(4, "four");
        dictionary.put(5, "five");
        dictionary.put(6, "six");
        dictionary.put(7, "seven");
        dictionary.put(8, "eight");
        dictionary.put(9, "nine");
        dictionary.put(10, "ten");
        dictionary.put(11, "eleven");
        dictionary.put(12, "twelve");
        dictionary.put(13, "thirteen");
        dictionary.put(14, "fourteen");
        dictionary.put(15, "fifteen");
        dictionary.put(16, "sixteen");
        dictionary.put(17, "seventeen");
        dictionary.put(18, "eighteen");
        dictionary.put(19, "nineteen");
        dictionary.put(20, "twenty");
        dictionary.put(21, "twenty one");
        dictionary.put(22, "twenty two");
        dictionary.put(23, "twenty three");
        dictionary.put(24, "twenty four");
        dictionary.put(25, "twenty five");
        dictionary.put(26, "twenty six");
        dictionary.put(27, "twenty seven");
        dictionary.put(28, "twenty eight");
        dictionary.put(29, "twenty nine");
        dictionary.put(30, "thirty");
        dictionary.put(31, "thirty one");
        dictionary.put(32, "thirty two");
        dictionary.put(33, "thirty three");
        dictionary.put(34, "thirty four");
        dictionary.put(35, "thirty five");
        dictionary.put(36, "thirty six");
        dictionary.put(37, "thirty seven");
        dictionary.put(38, "thirty eight");
        dictionary.put(39, "thirty nine");
        dictionary.put(40, "forty");
        dictionary.put(41, "forty one");
        dictionary.put(42, "forty two");
        dictionary.put(43, "forty three");
        dictionary.put(44, "forty four");
        dictionary.put(45, "forty five");
        dictionary.put(46, "forty six");
        dictionary.put(47, "forty seven");
        dictionary.put(48, "forty eight");
        dictionary.put(49, "forty nine");
        dictionary.put(50, "fifty");
        dictionary.put(51, "fifty one");
        dictionary.put(52, "fifty two");
        dictionary.put(53, "fifty three");
        dictionary.put(54, "fifty four");
        dictionary.put(55, "fifty five");
        dictionary.put(56, "fifty six");
        dictionary.put(57, "fifty seven");
        dictionary.put(58, "fifty eight");
        dictionary.put(59, "fifty nine");
        dictionary.put(60, "sixty");
    }
}
