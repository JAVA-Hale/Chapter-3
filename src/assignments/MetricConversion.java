package assignments;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args){
        int numInches;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number of inches >>> ");
        numInches = keyboard.nextInt();
        caculateToCentimeters(numInches);

        int numLiters;

        System.out.println("Enter a number of gallons >>> ");
        numLiters = keyboard.nextInt();
        caculateToLiters(numLiters);

    }
    public static void caculateToCentimeters(int numinches){
        double numCentimeters;
        final double NUM_CENTIMETERS_IN_INCHES = 2.54;
        numCentimeters = (numinches / NUM_CENTIMETERS_IN_INCHES);

        System.out.println("The number of centimeters is " + numCentimeters + "");
    }
    public static void caculateToLiters(double numLiters){
        final double NUM_LITERS_IN_GALLONS = 3.7854;
        numLiters = (numLiters / NUM_LITERS_IN_GALLONS);

        System.out.println("The number of centimeters is " + numLiters + "");
    }
}
