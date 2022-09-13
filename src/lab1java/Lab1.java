package lab1java;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        double S = 0;
        int C = 416 % 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values:");
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        if(a != 0){
            for (long i = a; i < n; i++){
                for (long j = b; j < m; j++){
                    S += (i + j)/((double)i/C);
                }
            }
            System.out.println("S = " + String.valueOf(S));

        }else {System.out.println("Error division to 0");}

    }
}
