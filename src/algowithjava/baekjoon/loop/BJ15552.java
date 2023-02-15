package algowithjava.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loopCnt = Integer.parseInt(br.readLine());
        for(int i=0; i<loopCnt; i++){
            String[] numArr = br.readLine().split(" ");
            int a = Integer.parseInt(numArr[0]);
            int b = Integer.parseInt(numArr[1]);
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
