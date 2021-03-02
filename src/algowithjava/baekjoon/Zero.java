package algowithjava.baekjoon;

import java.util.*;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<K; i++){
            int input = sc.nextInt();
            if(input==0) stack.pop();
            else stack.push(input);
        }

        for (Integer i : stack) {
            sum+=i;
        }

        System.out.print(sum);

    }

}
