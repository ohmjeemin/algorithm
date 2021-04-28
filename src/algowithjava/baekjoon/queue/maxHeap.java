package algowithjava.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine()); // n개의 수열을 만들겠다
        List<Integer> newList = new ArrayList<>();
        while(n-->0){
            int input = Integer.parseInt(br.readLine());
            if(input==0) {
                if(!list.isEmpty()) {
                    newList.add(Collections.max(list));
                    list.remove(Collections.max(list));
                }else {
                    newList.add(0);
                }
            }else {
                list.add(input);
            }
        }

        for(int num: newList){
            System.out.println(num);
        }

    }


}
