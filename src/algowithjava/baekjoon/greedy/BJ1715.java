package algowithjava.baekjoon.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ1715 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<cnt; i++){
            pq.add(sc.nextInt());
        }

        int sum = 0;
        while(pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            sum += a+b;
            pq.add(a+b);
        }

        System.out.println(sum);
    }
}
