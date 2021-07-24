package algowithjava.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15650 {
    private static int[] arr;
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1,0);

        System.out.println(sb);
    }

    //at은 어디서부터 시작하는지를 의미
    public static void dfs(int at,  int depth) {

        if(depth == M) {
            for(int val : arr) {
               sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=at; i <=N; i++) {

            arr[depth] = i;
            dfs(i+1, depth+1);

        }

    }

 }
