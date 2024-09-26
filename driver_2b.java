import java.util.*;
import java.io.*;
public class driver_2b {
    public static void main(String[] args) {


        Scanner in = new Scanner (System.in);
        StringTools st = new StringTools();
        System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = in.nextLine();
        System.out.println(st.lastLetter(answer1));

        System.out.println("formatPhoneNumber test cases:");
        System.out.println("Enter a 10 digit phone number: ");
        String answer2 = in.nextLine();
        System.out.println(st.formatPhoneNumber("1234567890"));


        System.out.println(st.middleThree("hello"));
        System.out.println(st.swapLastTwo("hello"));
        System.out.println(st.frontAgain("hello", 2));
    }
}
