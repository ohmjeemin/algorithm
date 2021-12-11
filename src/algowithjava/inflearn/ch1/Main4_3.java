package algowithjava.inflearn.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4_3 {
    public ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String str: strArr) {
            char[] s = str.toCharArray();
            int lt=0, rt=str.length()-1;
            while(lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main4_3 main = new Main4_3();
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

