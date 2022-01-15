
package algowithjava.inflearn.ch2;

import java.util.Scanner;


/*
소수(에라토스테네스 체) -> 걸러낸다.
- 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요
- 만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19로 총 8개 입니다.
* */
public class Main5 {
    public int solution(int n) {
        int cnt = 0;
        int[] arr = new int[n+1]; // 배열 선언만 하면 기본형이 들어있음
        for(int i=2; i<n; i++) { // 2부터 시작
            if(arr[i]==0) { // 0이면 소수 카운팅 하고
                cnt ++;
                for(int j=i; j<=n; j=j+i) { // 그 인덱스 배수를 다 1로 변경 j=j+i (j는 i씩 증가)
                    arr[j]=1;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Main5 main = new Main5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(main.solution(n));
    }
}

