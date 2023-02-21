package algowithjava.baekjoon.arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int target = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (st.hasMoreTokens()) {
            if(Integer.parseInt(st.nextToken()) == target) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
