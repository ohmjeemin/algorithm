package algowithjava.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15652 {
    /*
     * 1부터 N까지 자연수 중에서 M개를 고른 수열
     * 같은 수를 여러번 골라도 된다.
     * 고른 수열은 비내림차순이어야 한다.
     * */
    private static int N, M;
    private static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int at, int depth) {
        if(depth == M) {
            for(int value : arr) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=at; i<=N; i++) {
            arr[depth] = i;
            dfs(i, depth+1);
        }
    }
}
