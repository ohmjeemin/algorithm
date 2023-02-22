package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1000001;
        int idx = 0;
        for(int i=1; i<=9; i++) {
            int value = Integer.parseInt(br.readLine());
            if(value > max) {
                max = value;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
