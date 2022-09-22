package lab1java;
/**
 * C2 = 0; operation1: +
 * C5 = 1; operation2: /
 * C7 = 3; types of i and j: long*/
import java.util.Scanner;

public class Lab1 {



    public static void main(String[] args) {
        double S = 0;
        int C = 416 % 3;
        int m, n, a, b;
        boolean isSuccesful = false;
        while(!isSuccesful){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter values:");
                System.out.print("Enter m: ");
                m = scanner.nextInt();
                System.out.print("Enter n: ");
                n = scanner.nextInt();
                System.out.print("Enter a: ");
                a = scanner.nextInt();
                System.out.print("Enter b: ");
                b = scanner.nextInt();
                isSuccesful = true;
                if(a != 0){
                    for (long i = a; i < n; i++){
                        for (long j = b; j < m; j++){
                            if(i != 0){
                                S += (i + j)/((double)i/C);
                            }else {
                                System.out.println("Error division to 0");
                                break;
                            }
                        }
                    }
                    System.out.println("S = " + S);
                }else {System.out.println("Error division to 0");}
            }catch (Exception e){System.out.println("Input type is not Integer, try again");}

        }
    }
//    private static boolean isInteger(Object o){
//        return o.getClass().getName().equals("java.lang.Integer");
//    }
}
