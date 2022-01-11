
package algowithjava.inflearn.ch2;

import java.util.Scanner;


/*
보이는 학생
* */
public class Main2 {
    public int solution(int[] array) {
        StringBuilder answer = new StringBuilder(array[0] + " ");
        int cnt = 0;
        for(int i=1; i<array.length; i++){
            if(array[i-1]<array[i]) cnt ++;
        } 
        return cnt;
    }

    public static void main(String[] args){
        Main2 main = new Main2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print(main.solution(arr));
    }
}

