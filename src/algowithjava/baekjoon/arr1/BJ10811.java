package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        for(int i=1; i<=N; i++) {
            arr[i] = i;
        }
        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int temp = arr[first];
            arr[second] = arr[first];
            arr[first] = temp;
        }
    }
}
