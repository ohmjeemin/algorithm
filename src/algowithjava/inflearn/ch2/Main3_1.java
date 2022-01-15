
package algowithjava.inflearn.ch2;

import java.util.Scanner;


/*
가위바위보 - 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
1:가위, 2:바위, 3:보
* */
public class Main3_1 {
    public String solution(int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr1.length; i++) {
            if(arr1[i]==arr2[i]) sb.append("D");
            else if(arr1[i]==1 && arr2[i]==3) sb.append("A");
            else if(arr1[i]==2 && arr2[i]==1) sb.append("A");
            else if(arr1[i]==3 && arr2[i]==2) sb.append("A");
            else sb.append("B");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Main3_1 main = new Main3_1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++) {
            arr1[i] = in.nextInt();
        }
        for(int i=0; i<n; i++) {
            arr2[i] = in.nextInt();
        }
        for(char x: main.solution(arr1, arr2).toCharArray()) {
            System.out.println(x);
        }
    }
}

