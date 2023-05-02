package algowithjava.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCnt = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();

        for(int i=0; i<loopCnt; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) stk.pop();
            else stk.add(num);
        }

        int result = 0;
        Iterator<Integer> ite = stk.iterator();
        while (ite.hasNext()) {
            result += ite.next();
        }

        System.out.println(result);
    }
}
