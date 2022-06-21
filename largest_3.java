import java.util.Scanner;

public class largest_3 {
    public static void main(String[] args) {
        // int a,b,c;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        // largest among three
        int max=a;
        if (max<b){
                max=b;
        }
        if (max<c){
            max=c;
        }
        System.out.println(max);
        sc.close();

    }
}
