package algowithjava.baekjoon.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2750_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = Integer.parseInt(br.readLine());
        int[] arr = new int[loopCnt];
        for(int i=0; i<loopCnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int num: arr) {
            System.out.println(num);
        }
    }
}
