package algowithjava.baekjoon.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        int[] numbers = new int[cnt];
        for(int i=0; i<cnt; i++) {
            numbers[i] = (Integer.parseInt(br.readLine()));
        }
        Arrays.sort(numbers);

       for(int i=0; i<cnt; i++){
           sb.append(numbers[i]+"\n");
       }

        System.out.println(sb);
    }
}
