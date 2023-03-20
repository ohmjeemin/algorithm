package algowithjava.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCnt = Integer.parseInt(br.readLine());
        String[] numArr = br.readLine().split("");
        int sum = 0;
        for(int i=0; i<numArr.length; i++) {
            sum += Integer.parseInt(numArr[i]);
        }
        System.out.println(sum);
    }
}
