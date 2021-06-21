package algowithjava.baekjoon.order;
import java.io.*;
import java.util.*;

/*
* 수 정렬하기
* 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
* */
public class BJ2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] numbers = new int[cnt];
        int temp;

        for(int i=0; i<cnt; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<cnt-1; i++) {
            for(int j=0; j<cnt-1; j++) {
                if(numbers[j]>numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for(int i=0; i<cnt; i++){
            System.out.println(numbers[i]);
        }

    }
}
