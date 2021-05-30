package algowithjava.baekjoon.recursive;

import java.util.Scanner;

public class BJ10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 0;
        result=fibo(input);
        System.out.println(result);
    }
    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
}
