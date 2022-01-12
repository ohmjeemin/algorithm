
package algowithjava.inflearn.ch2;

import java.util.Scanner;


/*
가위바위보 - 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
* */
public class Main3 {
    public int solution(int[] array) {
        StringBuilder answer = new StringBuilder(array[0] + " ");
        int cnt = 1;
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>max) {
                max = array[i];
                cnt ++;
            }
        } 
        return cnt;
    }

    public static void main(String[] args){
        Main3 main = new Main3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print(main.solution(arr));
    }
}

