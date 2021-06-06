package algowithjava.baekjoon.divideandconquer;

import java.util.*;
public class BJ11444 {
    final static long MOD = 1000000007; // 1000000007

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in); // 입력 받겠습니다
//        long originN = sc.nextLong(); //long 하나 받는당
//        long n = originN - 1; // -1 하기
//        long[][] matrix = { {1,1}, {1,0} }; //{1,1} {1,0} 행렬하나
//        long[][] resultMat = { {1,0}, {0,1} }; //{1,0} {0,1} 행렬둘
//        while(n>0) { // n이 0보다 크면 반복
//            if(n%2==1) resultMat = multi(resultMat, matrix); // 나머지가 1이면 multi함수에 resultMat이랑 mat넘겨
//            matrix = multi(matrix, matrix); // 아니면 m그냥 mat mat넘겨서 mat에 넣어
//            n=n/2; // 2로 나누어
//        }
//        if(originN<3){ // 3보다 작으면 1찍어
//            System.out.print(1);
//        }else{
//            System.out.print((resultMat[1][0] + resultMat[1][1]) % MOD); // 아니면 resultMat[1][0] resultMat[1][1] % MOD
//        }


        Scanner sc = new Scanner(System.in);
        long originalN = sc.nextLong();
        long n = originalN - 1;
        long[][] matrix = {  {1,1},{1,0}};
        long[][] resultMat = {{1,0},{0,1}};
        while(n>0){
            if(n%2==1) resultMat = multi(resultMat, matrix);
            matrix = multi(matrix, matrix);
            n=n/2;
        }
        if(originalN<3){System.out.print(1);}
        else{System.out.print((resultMat[1][0] + resultMat[1][1]) % MOD );}
    }

//    public static long[][] multi(long[][] matrix1, long[][] matrix2){
//        int m1 = matrix1.length;
//        int n1 = matrix1[0].length;
//        int m2 = matrix2.length;
//        int n2 = matrix2[0].length;
//        long[][] temp = new long[m1][n2];
//
//        for(int i=0; i<m1; i++){
//            for(int j=0; j<n2; j++){
//                for(int k=0; k<n1; k++){
//                    temp[i][j] += matrix1[i][k] * matrix2[k][j];
//                }
//                temp[i][j] %= MOD;
//            }
//        }
//        return temp;
//    }

    public static long[][] multi(long[][] matrix1, long[][] matrix2){
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;
        long[][] temp = new long[m1][m2];
        for(int i=0; i<m1; i++){
            for(int j=0; j<n2; j++){
              for(int k=0; k<n1; k++){
                  temp[i][j] += matrix1[i][k] * matrix2[k][j];
              }
              temp[i][j]%=MOD;
            }
        }
        return temp;
    }
}
