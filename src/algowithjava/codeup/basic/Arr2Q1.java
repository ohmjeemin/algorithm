package algowithjava.codeup.basic;

import java.util.Scanner;

public class Arr2Q1 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("돌을 몇 개 둘거시야?");
        int n = sc.nextInt(); //돌을 갯수
        int x, y;
        int[][] arr=  new int[19][19]; //왜 19*19 아녀?

        for(int i=0; i<n; i++) {
            x = sc.nextInt(); //x좌표
            y = sc.nextInt(); //y좌표
            arr[x-1][y-1] = 1;
        }

        for(int j=0; j<19; j++) {
            for(int k=0; k<19; k++) {
                System.out.print(arr[j][k]);
            }
            System.out.println("");
        }
    }
}
