import java.util.*;
 class Quadratic
{
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        System.out.println("Enter 3 Values: ");
        double a=rs.nextInt();double b= rs.nextInt();double c=rs.nextInt();
        double delta=b*b-4*a*c;
        double root1=(-b + Math.sqrt(delta))/(2*a);
       double root2=(-b + Math.sqrt(delta))/(2*a);
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-delta) / (2 * a);
        System.out.println(realPart+" "+imaginaryPart);
    }
}
