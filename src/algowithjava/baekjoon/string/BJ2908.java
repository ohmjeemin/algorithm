package algowithjava.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        StringBuilder sb = new StringBuilder();
        int num1 = Integer.parseInt(sb.append(str1).reverse().toString());
        sb = new StringBuilder();
        int num2 = Integer.parseInt(sb.append(str2).reverse().toString());
        if(num1>num2) System.out.println(num1); else System.out.println(num2);
    }
}
