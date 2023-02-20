package algowithjava.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료
//데이터가 더이상 존재하지 않을 때 우리는 EOF (End of File)
//StringTokenizer가 split() 보다 낫다?

public class BJ10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            //String[] strArr = br.readLine().split(" ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b+"\n");
        }
        System.out.println(sb);
    }
}
