package algowithjava.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<loopCnt; i++) {
           char[] charArr = br.readLine().toCharArray();
           sb.append(charArr[0]).append(charArr[charArr.length-1]).append("\n");
        }
        System.out.println(sb);
    }
}
