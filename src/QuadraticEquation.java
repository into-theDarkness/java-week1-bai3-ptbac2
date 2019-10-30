import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return (-b - Math.pow(getDiscriminant(),0.5))/2;
    }
    public double getRoot2(){
        return (-b + Math.pow(getDiscriminant(),0.5))/2;
    }
    public double getRoot3(){
        return -b/2*a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PT bac 2: ax2+bx+c=0");
        System.out.println("Enter the a:");
         double a = input.nextDouble();
        System.out.println("Enter the b:");
        double b = input.nextDouble();
        System.out.println("Enter the c:");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("Pt vo nghiem");
        } else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Pt co nghiem kep: x1 = x2 =" + quadraticEquation.getRoot3());
        } else {
            System.out.println("Pt co 2 nghiem, x1 = " + quadraticEquation.getRoot2() + " x2 = " +quadraticEquation.getRoot1());
        }
    }
}
