package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10813 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //바구니
        int M = Integer.parseInt(st.nextToken()); //공바꾸는 횟수

        int[] baskets = new int[N];
        for(int i=0; i<baskets.length; i++) {
            baskets[i] = i+1;
        }

        /*주~의~~~~*/
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int startIdx = Integer.parseInt(st.nextToken())-1;
            int endIdx = Integer.parseInt(st.nextToken())-1;
            int temp = baskets[startIdx];
            baskets[startIdx] = baskets[endIdx];
            baskets[endIdx] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<baskets.length; i++) {
            sb.append(baskets[i]+" ");
        }

        System.out.println(sb);

    }
}
