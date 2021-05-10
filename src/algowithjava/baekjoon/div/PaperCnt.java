package algowithjava.baekjoon.div;

import java.io.*;

public class PaperCnt  {
    public static int[][] board;
    public static int zeroCnt = 0;
    public static int oneCnt = 0;
    public static int minusOneCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        for(int i=0; i<n; i++){
            String[] temp = br.readLine().split(" ");
            for(int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(temp[j]);
            }
        }


        partition(0,0, n);
        System.out.println(minusOneCnt);
        System.out.println(zeroCnt);
        System.out.println(oneCnt);

    }

    public static void partition(int row, int col, int size){

        if(numberCheck(row, col, size)){
            if(board[row][col]==0){
                zeroCnt++;
            }else if(board[row][col]==1){
                oneCnt++;
            }else{
                minusOneCnt++;
            }
            return;
        }

        int newSize = size/3;

        partition(row, col, newSize);								// 왼쪽 위
        partition(row, col + newSize, newSize);						// 중앙 위
        partition(row, col + 2 * newSize, newSize);					// 오른쪽 위

        partition(row + newSize, col, newSize);						// 왼쪽 중간
        partition(row + newSize, col + newSize, newSize);			// 중앙 중간
        partition(row + newSize, col + 2 * newSize, newSize);		// 오른쪽 중간

        partition(row + 2 * newSize, col, newSize);					// 왼쪽 아래
        partition(row + 2 * newSize, col + newSize, newSize);		// 중앙 아래
        partition(row + 2 * newSize, col + 2 * newSize, newSize);	// 오른쪽 아래
    }

    public static boolean numberCheck(int row, int col, int size){
        int number = board[row][col];
        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(number!=board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
