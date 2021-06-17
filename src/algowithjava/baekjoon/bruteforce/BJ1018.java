package algowithjava.baekjoon.bruteforce;
import java.util.*;

public class BJ1018 {

   static int N; // 세로
   static int M; // 가로
   static int[][] board; //보드
   static int result = Integer.MAX_VALUE;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        sc.nextLine();

        for(int i=0; i<N; i++) {
            String str = sc.next();
            for(int j=0; j<M; j++) {
                if(str.charAt(j) == 'W') board[i][j] = 1;
                else board[i][j] = 0;
            }
        }

        for(int i=0;i<N-7;i++){
            for(int j=0;j<M-7;j++){
                search(i,j);
            }
        }
        System.out.println(result);
    }

    public static void search(int x, int y){
        int a = x + 8;
        int b = y + 8;

        int color = board[x][y];
        int count = 0;

        for(int i=x; i<a; i++){
            for(int j=y; j<b; j++){
                if(board[i][j]!=color) count++;
                if(color==0) color = 1;
                else if(color==1) color = 0;
            }
            if(color==0) color = 1;
            else if(color==1) color = 0;
        }
        count = Math.min(count, 64-count);
        result = Math.min(result, count);
    }

}
