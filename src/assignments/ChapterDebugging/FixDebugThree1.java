package assignments.ChapterDebugging;

public class FixDebugThree1 {
    public static void main(String args[])
    {
        int myCheck = (int) 50.00;
        double yourCheck = 19.95;
        System.out.println("Tips are");
        calcTip((int) myCheck);
        calcTip((int) yourCheck);
    }
    public static void calcTip(int bill)
    {
        final double RATE = 0.15;
        double tip;
        tip = bill * RATE;
        System.out.println("The tip should be at least " + tip);
    }
}

