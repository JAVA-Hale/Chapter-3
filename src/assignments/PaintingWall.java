package assignments;

import java.util.Scanner;

public class PaintingWall {

    public static void main(String[] args){

        int wallWidth;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the width of the walls >>>  ");
        wallWidth = keyboard.nextInt();


        int wallHeight;
        System.out.println("Enter the height of the walls >>>  ");
        wallHeight = keyboard.nextInt();
        caculateWallArea(wallHeight,wallWidth);

    }
    public static void caculateWallArea(int wallHeight,int wallWidth){

        double wallArea;
        int numGallons;
        wallArea =  (wallWidth * wallHeight);
        numGallons = (int) Math.ceil(wallArea/350);
        System.out.println("Your wall area is " + wallArea +"   " );
        caculatePrice(numGallons);

    }
    public static void caculatePrice(int numGallons){


        int price = (numGallons * 32);
        System.out.println("You will need " + price + " gallons of paint");

    }
}
