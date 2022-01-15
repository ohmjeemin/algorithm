
package algowithjava.inflearn.ch2;

import java.util.Scanner;


/*
가위바위보 - 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
1:가위, 2:바위, 3:보
* */
public class Main3 {
    public String solution(int[] arr1, int[] arr2) {
        //TODO 여기서
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr1.length; i++) {
            if(arr1[i]==1) { // 가위를 냈을 때
                switch (arr2[i]) {
                    case 1 : sb.append("D");break;
                    case 2 : sb.append("B");break;
                    case 3 : sb.append("A");break;
                }
            }else if(arr1[i]==2) { // 바위를 냈을 때
                switch (arr2[i]) {
                    case 1 : sb.append("A");break;
                    case 2 : sb.append("D");break;
                    case 3 : sb.append("B");break;
                }
            }else { // 보를 냈을 때
                switch (arr2[i]) {
                    case 1 : sb.append("B");break;
                    case 2 : sb.append("A");break;
                    case 3 : sb.append("D");break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Main3 main = new Main3();
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

