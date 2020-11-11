package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        // Implement recursive method
       while (1 <= n) {
        if (!isPrime(n)) {
          System.out.println(n);
        }
        --n;
      }

    }

      }

    public static boolean isPrime(int n) {
        // Implement method

       int rec = 2;
      while (n > rec) {
        if (n % rec == 0) {
          return true;
        }
        ++rec;
      } 
        return false;
    }

