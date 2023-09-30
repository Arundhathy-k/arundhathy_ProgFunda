package com.gradedproject.q2;

import java.util.Scanner;

public class FindPower {
    
    static int findThePower(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return x * findThePower(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number X: ");
        int x = sc.nextInt();
        System.out.println("Enter the power N: ");
        int n = sc.nextInt();
        System.out.println("X power N is: " + findThePower(x, n));
        sc.close();
    }
}