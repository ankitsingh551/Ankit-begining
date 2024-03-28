import java. util.Scanner;
class SwapTwo1
{
public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter value for a");
 int a=s.nextInt();
 System.out.println("enter value for b");
 int b=s.nextInt();
 int t=a;
 a=b;
 b=t;
 System.out.println("a="+a);
 System.out.println("b="+b);
}
}
