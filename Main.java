import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    static void problem1a() {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your favourite course?");
        String intake = in.nextLine();
        System.out.println("What is your favourite show?");
        String intake1 = in.nextLine();
        System.out.println("How many hours do you spend studying each day?");
        String intake2 = in.nextLine();
        System.out.println("How many hours do you spend watching shows each day?");
        String intake3 = in.nextLine();
        System.out.println("Your favourite course is " + intake);
        System.out.println("Your favorite show is " + intake1);
        System.out.println("You spend " + intake2 + " hours studying each day.");
        System.out.println("You spend " + intake3 + " hours watching shows each day.");
        int sum = Integer.parseInt(intake2) + Integer.parseInt(intake3);
        System.out.println("In total, you spend " + sum + " hours studying and watching shows each day.");
    }
    static void problem1b_temp(){
        Scanner in = new Scanner(System.in);
        System.out.println("Current C: ");
        double cel = in.nextInt();
        double fah = (cel * 9/5) + 32;
        System.out.println("*** Celsius --> Fahrenheit ***");
        System.out.println("Enter a temperature in Celsius:"+cel);
        System.out.println(cel+"° Celsius = "+fah+"° Fahrenheit");
    }
    static void problem1b_BMI(){
        Scanner in = new Scanner(System.in);
        System.out.println("*** BMI Calculator ***");
        System.out.println("Enter a weight in kg:");
        double weight = in.nextDouble();
        System.out.println("Enter a height in m:");
        double height = in.nextDouble();
        double bmi = (weight/(height*height));
        System.out.println("A "+height+"m tall adult who weighs "+weight+"kg has a BMI of "+bmi);
    }
    static void problem1b_daysweek(){
        Scanner in = new Scanner(System.in);
        System.out.println("*** Days --> Weeks and Days ***");
        System.out.println("Enter a number of days:");
        int days = in.nextInt();
        int weeks = days/7;
        int remainingDays = days%7;
        System.out.println(days+" days is equal to "+weeks+" weeks and "+remainingDays+" days.");
    }
    static void problem1b_recipet(){
        Scanner in = new Scanner(System.in);
        System.out.println("*** Receipt Generator ***");
        System.out.println("Number of units you're buying: ");
        int units = in.nextInt();
        System.out.println("Price per unit: ");
        double price = in.nextDouble();
        System.out.println("Tax rate: ");
        double tax = in.nextDouble();
        double total = units*price+units*price*(tax/100);
        System.out.println("Purchasing "+units+" units at $"+price+" with "+tax+"% tax will cost $"+total);
    }
    static void problem1b_sumdigits(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive, three-digit number: ");
        int num = in.nextInt();
        int sum = num%10+(num/10)%10+(num/100)%10;
        System.out.println("The sum of the digits in "+num+" is "+sum);
    }
    public static void main(String[] args) {
        //problem1b_temp();
        problem1b_sumdigits();
    }
}



