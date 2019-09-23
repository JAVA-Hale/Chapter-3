package assignments;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args){
        double temp;
        double Celsius = 32;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your temp at 8:00 am >>> ");
        temp = (int) input.nextDouble();
        caculateToCelsiusint (temp, Celsius);
    }

    public static void caculateToCelsiusint(double temp, double Celsius) {
        temp = (temp - 32);

        System.out.println("It is " + temp + " celsius");
    }


    }

