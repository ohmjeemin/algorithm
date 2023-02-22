package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //첫줄은 안쓰이니까 입력만 받는다.
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        //모든 정수는 -1,000,000보다 크거나 같고,
        //1,000,000보다 작거나 같은 정수라고 되어있기 때문에 비교를 위해 max 에는 가장 작은 값으로, min 에는 가장 큰 값으로 초기화를 해준다.
        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());
            if(value > max) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
        }

        System.out.println(min+" "+max);
    }
}
