import java.util.Scanner;

public class ScannerEx {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a : ");
        int a = sc.nextInt();
        System.out.println("Enter the first number b : ");
        int b = sc.nextInt();
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        sc.close();
    }
}