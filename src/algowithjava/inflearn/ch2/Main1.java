
package algowithjava.inflearn.ch2;

import java.util.Scanner;


/*
큰 수 출력하기
* */
public class Main1 {
    public String solution(int[] array) {
        StringBuilder answer = new StringBuilder(array[0] + " ");
        for(int i=1; i<array.length; i++){
            if(array[i-1]<array[i]) answer.append(array[i]).append(" ");
        }
        return answer.toString();
    }

    public static void main(String[] args){
        Main1 main = new Main1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print(main.solution(arr));
    }
}

