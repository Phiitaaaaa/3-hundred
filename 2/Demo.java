import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        double xA, yA, xB, yB;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the coordinates of point A: ");
        xA = s.nextDouble();
        yA = s.nextDouble();
        System.out.println("Enter the coordinates of point B: ");
        xB = s.nextDouble();
        yB = s.nextDouble();
        Point A = new Point(xA, yA);
        Point B = new Point(xB, yB);
        System.out.println("Distance between A and B: "+Calcutator.distance(A, B));
    }
}

class Point{
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Calcutator
{
    public static double distance(Point a, Point b)
    {
        double xdistance = a.getX() - b.getX();
        double ydistance = a.getY() - b.getY();
        return Math.sqrt(xdistance * xdistance + ydistance * ydistance);
    }
}
