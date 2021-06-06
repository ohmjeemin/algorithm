package algowithjava.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StkNum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();	// '+' 이나 '-' 저장

        Stack<Integer> stack = new Stack<>(); // stack 생성

        int n = Integer.parseInt(br.readLine()); // n개의 수열을 만들겠다

        int start = 0;

        // n 번 반복
        while(n-->0) {

            int value = Integer.parseInt(br.readLine()); // 수를 받는다

            if(value > start) { // 1부터 입력받은 수까지 push
                for(int i = start + 1; i <= value; i++) { //1씩 push한다
                    stack.push(i);
                    sb.append("+"+"\n");	// + 를 저장한다.
                }
                start = value; 	// start에 어디까지 push 했는지 저장
            } else {
                if(stack.peek() != value) {  // top에 있는 원소가 입력받은 값과 같지 않은 경우
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-"+"\n");
        }
        System.out.println(sb);
    }

}
