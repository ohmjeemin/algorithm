package algowithjava.baekjoon.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] numbers = new int[cnt][2];

        StringTokenizer st;
        for(int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            numbers[i][0] = Integer.parseInt(st.nextToken());
            numbers[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0] - e2[0];
            }else {
                return e1[1] - e2[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<cnt; i++) {
            sb.append(numbers[i][0]).append(" ").append(numbers[i][1]).append("\n");
        }
        System.out.println(sb);

    }
}
