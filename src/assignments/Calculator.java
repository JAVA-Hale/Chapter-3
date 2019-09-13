package assignments;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        int userEntry1;
        int userEntry2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number >>> ");
        userEntry1 = input.nextInt();
        System.out.println("Enter a number >>> ");
        userEntry2 = input.nextInt();
        caculateAddition(userEntry1, userEntry2);
        caculateSubtraction(userEntry1, userEntry2);
        caculateMultiplication(userEntry1, userEntry2);
        caculateDivision(userEntry1, userEntry2);
        caculateModules(userEntry1, userEntry2);

        }

    public static void caculateAddition(int num1, int num2) {
        int total = num1 + num2;
        System.out.println(num1+ " + " + num2 + " = " + total);
    }
    public static void caculateSubtraction(int num1, int num2) {
        int total = num1 - num2;
        System.out.println(num1+ " - " + num2 + " = " + total);
    }
    public static void caculateMultiplication(int num1, int num2) {
        int total = num1 * num2;
        System.out.println(num1+ " * " + num2 + " = " + total);
    }
    public static void caculateDivision(int num1, int num2){
        int total = num1 / num2;
        System.out.println(num1+ " / " + num2 + " = " + total);
    }
    public static void caculateModules(int num1, int num2){
        int total = num1 % num2;
        System.out.println(num1+ " % " + num2 + " = " + total);
    }

}
