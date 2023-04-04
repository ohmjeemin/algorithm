package algowithjava.baekjoon.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2751_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = Integer.parseInt(br.readLine());
        int[] arr = new int[loopCnt];
        for(int i=0; i<loopCnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i=loopCnt-1; i>=0; i--) {
            //loopCnt-1 임을 주의할것
            System.out.println(arr[i]);
        }
    }
}
