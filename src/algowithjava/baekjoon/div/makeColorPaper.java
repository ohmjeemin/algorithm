package algowithjava.baekjoon.div;

import java.io.IOException;
import java.util.*;

public class makeColorPaper {

    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        board = new int[cnt][cnt];

        for(int i=0; i<cnt; i++) {
            for(int j=0; j<cnt; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        partition(0,0, cnt);

        System.out.println(white);
        System.out.println(blue);

    }

    public static void partition(int row, int col, int size) {

        if(colorCheck(row, col, size)) {
            if(board[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }

        int newSize = size / 2;
        // 재귀 호출
        partition(row, col, newSize); // 2사분면
        partition(row, col + newSize, newSize); // 1사분면
        partition(row + newSize, col, newSize); // 3사분면
        partition(row + newSize, col + newSize, newSize); // 4사분면


    }

    // 현재 파티션의 컬러가 같은지 체크
    public static boolean colorCheck(int row, int col, int size) {

        int color = board[row][col]; // 첫 번째 원소를 기준으로 검사

        for(int i = row; i < row+size; i++) {
            for(int j = col; j < col+size; j++) {

                if(board[i][j] != color) {  // 색상이 같지 않다면 false를 리턴
                    return false;
                }
            }
        }
        return true;
    }
}
