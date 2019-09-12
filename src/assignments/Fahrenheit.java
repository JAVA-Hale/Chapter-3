package assignments;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args){
        double temp;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your temp at 8:00 am >>> ");
        temp = (int) input.nextDouble();

    }

    public static void caculateToCelsius(int temp) {
        double Celsius;
        Celsius = (temp - 32)* 5/9;
    }
}
