import java.util.Scanner;

public class functions {
    public static void printfunction()
    {
        System.out.println("hello world ");
        return;
    }
    public static int  calucate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for addition");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum is :" + sum);
        return sum;
        
    }
    public static float  multiplication(float x, float y)
    {
     float multi=x*y;
        
     return multi;
    }
    public static void main(String args[])
    {
        printfunction();
        calucate();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values for mulitication");
        float x=sc.nextInt();
        float y=sc.nextInt();
        float multi=multiplication(x, y);
        System.out.println("the sum is :" + multi);
       
    }
}