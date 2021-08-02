package algowithjava.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9663 {
    /*
    * N x N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다. N이 주어졌을 때,
    * 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
    * */
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.print(count);

    }

    //1. 재귀호출 부분
    public static void nQueen(int depth) {
        //행을 다 채우면 카운트를 1 증가시키고 리턴하기.
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if(possibility(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    //2. 놓을 위치가 다른 퀸으로부터 위협받는지를 검사하는 조건문
    public static boolean possibility(int col) {
        for(int i=0; i<col; i++){
            if(arr[i] == arr[col]) {
                return false;
            }
            if(Math.abs(col-i) == Math.abs(arr[col]-arr[i])) {
                return false;
            }
        }
        return true;
    }
}
