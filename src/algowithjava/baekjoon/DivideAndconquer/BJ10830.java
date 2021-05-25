package algowithjava.baekjoon.DivideAndconquer;


/*
 * ㅁ 문제: 크기가 N*N인 행렬 A가 주어진다. 이때, A의 B제곱을 구하는 프로그램을 작성하시오.
 *          수가 매우 커질 수 있으니, A^B의 각 원소를 1,000으로 나눈 나머지를 출력한다.
 * ㅁ 입력: 첫째 줄에 행렬의 크기 N과 B가 주어진다. (2 ≤ N ≤  5, 1 ≤ B ≤ 100,000,000,000)
 *          둘째 줄부터 N개의 줄에 행렬의 각 원소가 주어진다. 행렬의 각 원소는 1,000보다 작거나 같은 자연수 또는 0이다.
 * ㅁ 출력: 첫째 줄부터 N개의 줄에 걸쳐 행렬 A를 B제곱한 결과를 출력한다.
 * */

import java.util.Scanner;

public class BJ10830 {
    static int MOD = 1000, N;
    static int[][] unitMatrix; // 단위행렬

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        long B = sc.nextLong();

        int[][] matrix = new int[N][N];
        unitMatrix = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt() % MOD;
            }
        }

        for (int i = 0; i < N; i++) {
            unitMatrix[i][i] = 1;
        }

        matrix = powMatrix(B, matrix);

        for (int[] m : matrix) {
            for (int i : m) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // 행렬의 제곱근
    static int[][] powMatrix(long n, int[][] matrix) {
        if (n == 0) return unitMatrix;
        if (n == 1) return matrix;

        int[][] nMatrix = powMatrix(n / 2, matrix);
        nMatrix = multipleMatrix(nMatrix, nMatrix);

        return n % 2 == 0 ? nMatrix : multipleMatrix(nMatrix, matrix);
    }

    // 행렬의 곱셈
    static int[][] multipleMatrix(int[][] m1, int[][] m2) {
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    matrix[i][j] += (m1[i][k] * m2[k][j]) % MOD;
                }
                matrix[i][j] %= MOD;
            }
        }

        return matrix;
    }
}