package algowithjava.baekjoon.divideandconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiply {

    public static long C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(A,B));
    }


    public static long pow(long A, long exponent) {
        //지수가 1일 경우 A^1이므로 A그대로 리턴
        if(exponent==1) return A % C;

        //지수의 절반에 해당하는 A^(exponent/2) 을 구한다.
        long temp = pow(A, exponent / 2);

        //지수가 홀수일 때 한번 더 곱해준다
        if(exponent%2==1) return (temp * temp % C) * A % C;
        //그 외에는 짝수이므로 구했던 값을 한번 더 곱해서 반환한다.
        return temp * temp % C;
    }

}
