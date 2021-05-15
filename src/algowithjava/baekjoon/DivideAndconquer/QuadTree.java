package algowithjava.baekjoon.DivideAndconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree {
    
    static StringBuilder sb = new StringBuilder();
    public static int[][] board;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        for(int i=0; i<n; i++) {
            String[] temp = br.readLine().split("");
            for(int j=0; j<n; j++) {
                board[i][j] = Integer.parseInt(temp[j]);
            }
        }

        partition(0, 0, n);
        System.out.println(sb);
    }

    public static void partition(int row, int col, int size) {

        if(check(row, col, size)) {
            if(board[row][col] == 0) {
                sb.append(0);
            }
            else {
                sb.append(1);
            }
            return;
        }

        int newSize = size / 2;
        // 재귀 호출
        sb.append("(");
        partition(row, col, newSize); // 4사분면
        partition(row, col + newSize, newSize); // 1사분면
        partition(row + newSize, col, newSize); // 3사분면
        partition(row + newSize, col + newSize, newSize); // 2사분면
        sb.append(")");

    }

    public static boolean check(int row, int col, int size) {

        int part = board[row][col]; // 첫번째 원소 기준으로 검사

        for(int i = row; i < row+size; i++) {
            for(int j = col; j < col+size; j++) {

                if(board[i][j] != part) {  // 같지 않다면 false를 리턴
                    return false;
                }
            }
        }
        return true;

    }
}
