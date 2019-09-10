package examples;

import java.util.Scanner;

public class DemoRaise {

    public static void main(String[] args){

        double salary = 400.00;
        Scanner input = new Scanner(System.in);
        pl("Enter your salary >>> ");
        salary = input.nextInt();
        pl("Demonstrating some raises:");

        predictRaise(salary);
    }
    public static void predictRaise(double salary)
    {
        double newSalray;
        final double RAISE_RATE = 1.10;
        newSalray = salary * RAISE_RATE;

        pl("Current salary: " + salary + "\nAfter raise: " + newSalray);
    }
    public static void pl(String p){
        System.out.println(p);
    }
}
