package algowithjava.baekjoon.recursive;

import java.util.*;

public class BJ2447 {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        arr = new char[n][n];

        for(int i=0;i<arr.length;i++) {
            Arrays.fill(arr[i],' ');
        }

        star(0,0, n);

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }


    }

    public static void star(int a, int b, int n) { // 재귀호출을 반복 할 메소드이다.
        int div = 0;
        if(n==1) { // 재귀 호출이 끝나는 부분
            arr[a][b] = '*';
            return;
        }

        div= n/3; // 입력받은 n 값을 계속 3씩 나눠준다.

        for(int i=0;i<3;i++) { //3x3크기의 별을 만든다.
            for(int j=0;j<3;j++) {
                if(i==1 && j ==1) continue;
                star(a+(div*i),b+(div*j),div); //시작점을 옮겨준다. 27의 경우 (0,0) (0,9) 식으로 옮겨간다.
            }
        }

    }
}
