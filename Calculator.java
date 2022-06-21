import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true)
        {
            char op=sc.next().trim().charAt(0);
            if (op == '+'||op=='-'||op=='/'||op=='%')
            {
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                if (op=='+')
                {
                    System.out.println(num1+num2+" is the addition of numbers");
                }
                if (op=='-')
                {
                    System.out.println(num1-num2+" is the subration of two numbers");

                }
                if (op=='/')
                {
                    System.out.println(num1/num2+" is the divition of two numbers");
                }
                if (op=='%')
                {
                    System.out.println(num1%num2 +"is the remainder of the numbers");
                }


            }
            else if (op=='x')
            {
                break;
            }
            else{
                System.out.println("Invalid operator");
            }

        }
        sc.close();

    }
}
