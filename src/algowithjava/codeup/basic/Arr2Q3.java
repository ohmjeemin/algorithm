package algowithjava.codeup.basic;

import java.util.*;

public class Arr2Q3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // 격자판의 세로 가로
        int h = sc.nextInt();
        int w = sc.nextInt();
        // 막대 수
        int n = sc.nextInt();

        int[][] arr = new int[w+1][h+1];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();  // 막대 길이
            int d = sc.nextInt();  // 막대 방향
            int x = sc.nextInt();  // 좌표
            int y = sc.nextInt();
            for(int j = 0; j < l; j++) {
                arr[x][y] = 1;
                if(d==0) y++;
                else x++;
            }
        }

        for (int k=1; k<w+1; k++) {
            for (int q=1; q < h+1; q++) {
                if(q==h){
                    System.out.print(arr[k][q]);
                    break;
                }
                System.out.print(arr[k][q]+" ");
            }
            System.out.println();
        }
    }
}
