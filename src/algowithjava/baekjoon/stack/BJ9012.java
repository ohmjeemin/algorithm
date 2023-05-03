package algowithjava.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<loopCnt; i++) {
            String vpc = br.readLine();
            sb.append(checkVPC(vpc)+"\n");
        }
        System.out.println(sb);
    }

    public static String checkVPC(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(stack.isEmpty()) return "YES"; else return  "NO";
    }

}
