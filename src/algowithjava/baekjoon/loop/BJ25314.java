package algowithjava.baekjoon.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ25314 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        new BJ25314().solution();
    }
}

