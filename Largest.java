import java.util.Scanner;

public class Largest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n1 = sc.nextInt();
        System.out.println("enter second number");
        int n2 = sc.nextInt();
        System.out.println("enter third number");
        int n3 = sc.nextInt();
        if(n1>n2&&n1>n3)
        {
            System.out.println("Larger is "+n1);

        }
        else if(n2>n1&&n2>n3)
        {
            System.out.println("Larger is" +n2);

        }
        else
        {
            System.out.println("Larger is" +n3);


        }

    }
    
}
