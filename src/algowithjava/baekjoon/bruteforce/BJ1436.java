package algowithjava.baekjoon.bruteforce;

import java.util.Scanner;
/*
* 체스판 다시 칠하기
* 
* */
public class BJ1436 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}

