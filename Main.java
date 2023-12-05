import java.util.*;
class Distance
{
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        System.out.println("Enter 2 values: ");
        int x=rs.nextInt();int y=rs.nextInt();
        double res=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println(res);
    }
}