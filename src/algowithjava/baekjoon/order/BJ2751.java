package algowithjava.baekjoon.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<cnt; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);

        for(int num : numbers) {
            sb.append(num+"\n");
        }
        System.out.println(sb);

    }
}
