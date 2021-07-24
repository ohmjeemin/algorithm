package algowithjava.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static algowithjava.baekjoon.backtracking.BJ15649.dfs;

public class BJ15649_2 {
    private static int[] arr;
    private static boolean[] visit;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);

    }

    public static void bfs(int N, int M, int depth) {
        if(depth == M) {
            for(int val: arr) {
                System.out.println(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth+1);
                visit[i] = false;
            }
        }
        return;
    }

 }
