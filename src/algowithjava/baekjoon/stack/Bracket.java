package algowithjava.baekjoon.stack;
import java.util.*;
import java.io.*;

public class Bracket {


    public static void main(String[] args) {

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(bf.readLine());
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<a; i++) {
                sb.append(checkVPS(bf.readLine())+"\n");
            }
            System.out.println(sb.toString());
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public static String checkVPS(String bracket) {
        int left=0;
        Stack<Character> stack = new Stack<>();

        for(char c:bracket.toCharArray()) {
            if(c=='(') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }
        return stack.size()==0?"YES":"NO";
    }
}
