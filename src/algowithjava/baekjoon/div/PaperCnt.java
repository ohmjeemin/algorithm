package algowithjava.baekjoon.div;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            System.out.println("ㅎㅋ");
            if(board[row][col]==0){

                zeroCnt++;
            }else if(board[row][col]==1){
                oneCnt++;
            }else{
                minusOneCnt++;
            }
            return;
        }
        System.out.println("ㅜㅜ");
        int newSize = size/3;
        partition(row, col, newSize);
        partition(row,col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
    }

    public static boolean numberCheck(int row, int col, int size){
        System.out.println("ㅎㅎㅎㅎ" +
                "");
        int number = board[row][col];
        System.out.println("number "+number);
        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                System.out.println("board value "+board[i][j]);
                if(number!=board[row][col]) {
                    return false;
                }
            }
        }
        System.out.println("33");
        return true;
    }

}
