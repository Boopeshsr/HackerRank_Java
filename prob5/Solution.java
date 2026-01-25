package prob5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt(); // number of queries

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int value = a;
            int power = 1;

            for (int j = 0; j < n; j++) {
                value += b * power;
                System.out.print(value + " ");
                power *= 2;
            }
            System.out.println();
        }

        sc.close();
    }
}

