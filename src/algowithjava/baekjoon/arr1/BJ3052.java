package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ3052 {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
    }
}
