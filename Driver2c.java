import java.util.*;
import java.io.*;
public class Driver2c {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c: ");
        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("c: ");
        double c = in.nextDouble();
        OrderedPair op = new OrderedPair();
        OrderedPair roots = op.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for "+a+"x^2 + "+b+"x + "+c+" are ("+roots.getX()+", "+roots.getY()+").\n");

        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = in.nextDouble();
        System.out.print("y1: ");
        double y1 = in.nextDouble();
        System.out.print("x2: ");
        double x2 = in.nextDouble();
        System.out.print("y2: ");
        double y2 = in.nextDouble();
        OrderedPair A = new OrderedPair(x1, y1);
        OrderedPair B = new OrderedPair(x2, y2);
        double slope = op.findSlope(A, B);
        System.out.println("A line between ("+x1+", "+y1+") and ("+x2+", "+y2+") has a slope of "+slope+".\n");

        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        x1 = in.nextDouble();
        System.out.print("y1: ");
        y1 = in.nextDouble();
        System.out.print("x2: ");
        x2 = in.nextDouble();
        System.out.print("y2: ");
        y2 = in.nextDouble();
        A = new OrderedPair(x1, y1);
        B = new OrderedPair(x2, y2);
        OrderedPair midpoint = op.findMidpoint(A, B);
        System.out.println("The midpoint between ("+x1+", "+y1+") and ("+x2+", "+y2+") is ("+midpoint.getX()+", "+midpoint.getY()+").\n");

        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int k = in.nextInt();
        System.out.print("Starts with: ");
        double start = in.nextDouble();
        System.out.print("Increases by: ");
        double increase = in.nextDouble();
        double sum = op.findArithmeticSeriesSum(start, increase, k);
        System.out.println("The sum of the first "+k+" terms of an arithmetic series that starts with "+start+" and increases by "+increase+" is "+sum+".\n");

        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        k = in.nextInt();
        System.out.print("Starts with: ");
        start = in.nextDouble();
        System.out.print("Rate of growth: ");
        double rate = in.nextDouble();
        sum = op.findGeometricSeriesSum(start, rate, k);
        System.out.println("The sum of the first "+k+" terms of a finite geometric series that starts with "+start+" and increases by a rate of "+rate+" is "+sum+".\n");

        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int sides = in.nextInt();
        int roll = op.rollDie(sides);
        System.out.println("Rolling a "+sides+"-sided die... you got a "+roll+"!");


    }
}

