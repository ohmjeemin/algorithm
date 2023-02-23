package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10810 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //바구니
        int M = Integer.parseInt(st.nextToken()); //공넣는방법

        int[] baskets = new int[N];


        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int startIdx = Integer.parseInt(st.nextToken())-1;
            int endIdx = Integer.parseInt(st.nextToken())-1;
            int ball = Integer.parseInt(st.nextToken());
            for(int j=startIdx; j<=endIdx; j++) {
                baskets[j] = ball;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<baskets.length; i++) {
            sb.append(baskets[i]+" ");
        }

        System.out.println(sb);

    }
}
