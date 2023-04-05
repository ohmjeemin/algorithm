package algowithjava.baekjoon.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String[] numStrArr = num.split("");
        int[] numArr = new int[numStrArr.length];
        for(int i=0; i<numStrArr.length; i++) {
            numArr[i] = Integer.parseInt(numStrArr[i]);
        }
        Arrays.sort(numArr);
        for(int i=numArr.length-1; i>=0; i--) {
            System.out.print(numArr[i]);
        }

    }
}
