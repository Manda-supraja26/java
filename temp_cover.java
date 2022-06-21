import java.util.Scanner;

public class temp_cover {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        float temp=sc.nextFloat();
        float tempF=(temp*9/5)+32;
        System.out.println(tempF);
        sc.close();
    }
}
