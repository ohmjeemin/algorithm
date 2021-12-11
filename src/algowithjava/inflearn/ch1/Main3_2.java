package algowithjava.inflearn.ch1;

import java.util.Scanner;

public class Main3_2 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        while ((pos=str.indexOf(' '))!=-1) {
            String tmp = str.substring(0, pos); // substring(x1, x2) : 인덱스 x1 이후부터 x2 전까지
            int len = tmp.length();
            if(len>m) {
                m=len;
                answer=tmp;
            }
            str = str.substring(pos+1); // substring(x) : 인덱스 x 이후부터 끝까지
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args){
        Main3_2 main = new Main3_2();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();

        System.out.print(main.solution(str));
    }
}

