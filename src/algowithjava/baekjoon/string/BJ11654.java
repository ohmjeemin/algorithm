package algowithjava.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//char형은 아스키 코드 값으로 8비트 정수형 값을 가진다.
//char형은 애초에 문자 하나가 아닌 정수형 코드 값을 가지고 있다.
//입력 포맷에 따라 %c면 문자가 출력되고 %d이면 코드값이 출력된다.
public class BJ11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = br.readLine().charAt(0);
        System.out.println(num);
    }
}
