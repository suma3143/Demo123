    import java.util.Scanner;
    public class Samp
    {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println(a +" "+ b);
        System.out.println("After Swapping");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);           
    } 
}


    

