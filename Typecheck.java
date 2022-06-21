import java.util.Scanner;

public class Typecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // char word=sc.next();
        char ch=sc.next().trim().charAt(3);
        System.out.println(ch);
        sc.close();
    }
}
