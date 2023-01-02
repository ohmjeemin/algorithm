package algowithjava.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] kind = new int[n];

        for(int i=0; i<n; i++) {
            kind[i] = Integer.parseInt(br.readLine());
        }
        //test
        int cnt = 0;
        for(int i=n-1; i>=0; i--) {
            if(kind[i] <= k) {
                cnt += (k / kind[i]);
                k = k % kind[i];
            }
        }
        System.out.println(cnt);
    }

}
