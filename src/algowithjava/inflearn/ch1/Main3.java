package algowithjava.inflearn.ch1;

import java.util.Scanner;

public class Main3 {
    public String solution(String str) {
        String[] arr = str.split(" ");
        int max = Integer.MIN_VALUE;
        String answer = "";

        for(String x: arr) {
            int len = x.length();
            if(len > max) {
                max = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main3 main = new Main3();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();

        System.out.print(main.solution(str));
    }
}

