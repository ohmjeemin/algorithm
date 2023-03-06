package algowithjava.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2480 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c  = Integer.parseInt(st.nextToken());
        int max;
        if(a != b && a != c && b != c) {
            if(a > b) {
                if(c > a) max = c;
                else max = a;
            }else {
                if(c > b) max = c;
                else max = b;
            }
            System.out.println(max * 100);
        }else {
            if(a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }else {
                if(a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }else {
                    System.out.println(1000 + b * 100);
                }
            }

        }

    }
}
