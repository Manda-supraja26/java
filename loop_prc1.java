import java.util.Scanner;

public class loop_prc1 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        /*sysntax if statement */
        int salary =scanner.nextInt();


        // if (salary>100000){
        //     salary=salary+2000;
            
        // }
        // else{
        //     salary=salary+1000;

        // }

        if (salary>100000)
        {
            salary=salary+2000;
        }
        else if(salary<10000)
        {
            salary+=1000;

        }
        else {
            salary=salary+0;
        }




        System.out.println("the salary is"+salary);
        scanner.close();
    }
}
