package algowithjava.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BalancedWorld {

    public static void main(String[] args) throws Exception {
      //  Scanner sc = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            while (true) {
                String s = br.readLine();
                if (".".equals(s)) {
                    break ;
                }
                sb.append(check(s)+"\n");

            }
            System.out.println(sb.toString());
            br.close();
        }catch(Exception e) {
            System.out.println("오류우");
        }
    }


    public static String check(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()) {

            switch(c) {
                case '(':
                case '[':  stack.push(c); break;
                case ')': if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
                          else return "no";
                break;
                case ']': if(!stack.isEmpty() && stack.peek()=='[') stack.pop();
                          else return "no";
                break;
            }
        }
        return stack.isEmpty() ? "yes" : "no";
    }

}
