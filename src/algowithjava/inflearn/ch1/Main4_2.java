package algowithjava.inflearn.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4_2 {
    public ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String str: strArr) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main4_2 main = new Main4_2();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] strArr = new String[n];

        for(int i=0; i<n; i++) {
           strArr[i] = in.next();
        }

        for(String x: main.solution(n, strArr)) {
            System.out.println(x);
        }

    }
}

