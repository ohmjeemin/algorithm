package algowithjava.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


//일반적으로 큰 수를 쓸 때 쓰는 long형은 264-1으로 약 1844경 정도 된다.
//하지만 이 번 문제의 경우 입력 범위가 최대 1010000 이므로 long형을 아득히 넘는다.
public class BJ10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        BigInteger b1 = new BigInteger(st.nextToken());
        BigInteger b2 = new BigInteger(st.nextToken());
        System.out.println(b1.add(b2));
    }

}
