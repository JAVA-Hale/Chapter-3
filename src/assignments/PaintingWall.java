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
    public static void caculateWallArea(double wallHeight,double wallWidth){

        int wallArea;
        int numGallons;
        wallArea = (int) (wallWidth * wallHeight);
        numGallons = wallArea/350;
        System.out.println("Your wall area is " + wallArea +"");
        caculatePrice(numGallons);

    }
    public static void caculatePrice(int numGallons){
        int price = (int) (numGallons * 32);
        Math.ceil(numGallons);
        System.out.println("You will need " + price + " gallons of paint");

    }
}
