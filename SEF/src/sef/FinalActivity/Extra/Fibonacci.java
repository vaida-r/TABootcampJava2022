package sef.FinalActivity.Extra;


import java.util.Scanner;

public class Fibonacci {


    private static void printFibonacci(int fib){

        int f1 = 0;
        int f2 = 1 ;
        int ff;
        String res = f1 + " ";

        if (fib == 1) {
            System.out.print(res);
        } else if (fib == 2) {
            res = res + f2 + " ";
            System.out.print(res);
        } else {
            res = f1 + " " + f2 + " ";
            for (int i = 3; i <= fib; i++){
                ff = f1 + f2;
                res = res + ff + " ";

                f1 = f2;
                f2 = ff;
            }
            System.out.println(res);
        }

    }


    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int howMany = keyboard.nextInt();

        printFibonacci(howMany);

    }

}
