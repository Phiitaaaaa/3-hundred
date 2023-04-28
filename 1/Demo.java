import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of the globular: ");
        S=sc.nextDouble();
        double R = Math.sqrt(S/(4*Math.PI));
        Calcutator c = new Calcutator();
        System.out.println("Volume of the globular: "+c.volume(R));
    }
}

class Calcutator{
    public double volume(double  R)
    {
        double V = (4.0/3.0)*Math.PI*Math.pow(R,3);
        return V;
    }
}
