package assignments;

import java.util.Scanner;

public class PoundsConversion {

    public static void main(String[] args){
        int numPounds;
        int numKilograms;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number of pounds >>> ");
        numPounds = keyboard.nextInt();
        caculateToKilograms(numPounds);
        caculateToOunces(numPounds);
        caculateToMiligrams(numPounds);

    }
    public static void caculateToKilograms(int numPounds){
        double numKilograms;
        final double NUM_KILOGRAMS_IN_POUNDS = 2.205;
        numKilograms = (numPounds/NUM_KILOGRAMS_IN_POUNDS);
        System.out.println("It equals " + numKilograms + " kilograms");
    }
    public static void caculateToOunces(int numPounds){
        double numOunces;
        final double NUM_OUNCES_IN_POUNDS = 16;
        numOunces = (numPounds * NUM_OUNCES_IN_POUNDS);
        System.out.println("It equals " + numOunces + " ounces");
    }
    public static void caculateToMiligrams(int numPounds){
        double numMiligrams;
        final double NUM_MILIGRAMS_IN_POUNDS = 453592.37;
        numMiligrams = (numPounds * NUM_MILIGRAMS_IN_POUNDS);
        System.out.println("It equal1s " + numMiligrams + " ounces");
    }
    }

