package algowithjava.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15649 {
    /*
    * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
    * - 1부터 N까지 자연수 중에서 '중복 없이' M개를 고른 수열
    * */
    private static int[] arr;
    private static boolean[] isVisited;
    private static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M]; //탐색과정에서 값을 담을 int 배열 arr
        isVisited = new boolean[N]; //유망한 노드인지 검사하기 위해
        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int depth) {
        //재귀 길이가 M과 같아지면 탐색과정에서 담았던 배열을 출력
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++) {
            if(!isVisited[i]){
                isVisited[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                isVisited[i] = false;
            }
        }
    }
}
