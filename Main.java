import java.io.*;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your favourite course?");
        String intake = in.nextLine();
        System.out.println("What is your favourite show?");
        String intake1 = in.nextLine();
        System.out.println("How many hours do you spend studying each day?");
        String intake2 = in.nextLine();
        System.out.println("How many hours do you spend watching shows each day?");
        String intake3 = in.nextLine();


        System.out.println("Your favourite course is "+intake);
        System.out.println("Your favorite show is "+intake1);
        System.out.println("You spend "+intake2+" hours studying each day.");
        System.out.println("You spend "+intake3+" hours watching shows each day.");
        int sum = Integer.parseInt(intake2)+Integer.parseInt(intake3);
        System.out.println("In total, you spend "+sum+" hours studying and watching shows each day.");


    }
}

~/IdeaProjects/AP CSA

