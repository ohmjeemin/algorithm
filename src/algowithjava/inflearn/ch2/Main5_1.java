
package algowithjava.inflearn.ch2;

import java.util.Scanner;


/*
소수(에라토스테네스 체)
- 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요
- 만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19로 총 8개 입니다.
* */
public class Main5_1 {
    public int solution(int n) {
        int cnt = 0;
        for(int i=2; i<n; i++) {
            boolean isPrime = false;
            for(int j=2; j<i-1; j++) {
                if(i%j==0) {
                    break;
                }
                else {
                    isPrime = true;
                }
            }
            if(isPrime) cnt ++;
        }
        return cnt;
    }

    public static void main(String[] args){
        Main5_1 main = new Main5_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(main.solution(n));
    }
}

