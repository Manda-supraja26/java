import java.sql.Array;
import java.util.Scanner;

public class fibonanci_number {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // Array array=new Array() {
            
        // };
        // for (int i = 0; i <n ; i++) {
        //     int k =a+b;
        //     a=b;
        //     b=k;
        //     System.out.println(k);
            
        // }



        int count=2;
        while (count<=n){
            int k=a+b;
            a=b;
            b=k;
            count++;
            
        }
        System.out.println(b);
        
        sc.close();
    }



    // while loop
        


}
