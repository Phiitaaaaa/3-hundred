import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double xC, yC, xM, yM;
        double R;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter doorinates of C: ");
        xC=s.nextDouble();
        yC=s.nextDouble();
        System.out.println("Enter radius of circle: ");
        R=s.nextDouble();
        System.out.println("Enter doorinates of M: ");
        xM=s.nextDouble();
        yM=s.nextDouble();
        Point M = new Point(xM, yM);
        Point C = new Point(xC, yC);
        if(R < Calculator.distance(M, C))
        System.out.println("M is not in the circle");
        else if(R > Calculator.distance(M, C))
        System.out.println("M is in the circle");  
        else
        System.out.println("M is on the circle");
    }
}
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y ;
    }
}
class Calculator {
    public static double distance(Point M, Point C) {
        double xdistance = M.getX() - C.getX();
        double ydistance = M.getY() - C.getY();
        return Math.sqrt(Math.pow(xdistance, 2) + Math.pow(ydistance, 2));
    }
}

