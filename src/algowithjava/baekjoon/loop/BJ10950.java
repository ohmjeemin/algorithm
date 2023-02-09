package algowithjava.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BJ10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
            String[] lineArr =  br.readLine().split(" ");
            int a = Integer.parseInt(lineArr[0]);
            int b = Integer.parseInt(lineArr[1]);
            sb.append(a+b+"\n");
        }
        System.out.println(sb);
    }
}
