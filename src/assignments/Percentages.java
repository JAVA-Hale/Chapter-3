package assignments;

public class Percentages {

    public static void main(String[] args){

        double t = 3.0;
        double h = 5.0;
        double total = t + h;
        computePercent(t, h);




    }
     public static void computePercent(double t, double h){

        double total = t / h * 100;

        System.out.println(+ t + " is " + total + "% percent of " + h );
     }
}
