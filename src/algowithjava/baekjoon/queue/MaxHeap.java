package algowithjava.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxHeap {
    public static void main(String[] args) throws IOException {
        //TODO 분할분석 공부 후에 다시 짜기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine()); // n개의 수열을 만들겠다

        while(n-->0){
            int input = Integer.parseInt(br.readLine());
            if(input==0) {
                if(!list.isEmpty()) {
                    sb.append(Collections.max(list)).append("\n");
                    list.remove(Collections.max(list));
                }else {
                    sb.append(0).append("\n");
                }
            }else {
                list.add(input);
            }
        }
        System.out.println(sb);
    }

}
