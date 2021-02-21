package algowithjava.codeup.basic;

import java.util.Scanner;

public class Arr2Q2 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //십자 뒤잡기 횟수
        int x, y, p, q;
        int[][] arr=  new int[19][19];

        for(int i=1; i<20; i++) { // 한줄 씩 바둑판 상황 입력 받기
            for(int h=1; h<20; h++) {
                x = sc.nextInt();
                arr[i][h]=x;
            }
        }

        for(int j=0; j<19; j++) { // 입력 받은거 출력해바
            for(int k=0; k<19; k++) {
                System.out.print(arr[j][k]+" ");
            }
            System.out.println("");
        }

//        for(int w=0; w<n; w++) {
//            p = sc.nextInt();
//            q = sc.nextInt();
//            for(int s=0; s<19; s++) {
//                arr[p-1][s] = arr[p-1][q-1]==1?0:1; // 뒤집기
//                arr[s][q-1] = arr[p-1][q-1]==1?0:1; // 뒤집기
//            }
//        }
//
//        for(int j=0; j<19; j++) {
//            for(int k=0; k<19; k++) {
//                System.out.print(arr[j][k]+" ");
//            }
//            System.out.println("");
//        }
    }
}
