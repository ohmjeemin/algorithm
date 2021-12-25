package algowithjava.inflearn.ch1;

import java.util.Scanner;


/*
* 가장 짧은 문자거리
* 한 개의 문자열 s와 문자 t가 주어지면 문자열 s가 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요
*
* */
public class Main10 {
    public int[] solution(String s, char t) {

        int[] answer = new int[s.length()];
        //char[] strArr = s.toCharArray();
        int p = 1000;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)==t) {
                p = 0;
                answer[i] = p;
            }else {
                p = p + 1;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int j=s.length()-1; j>=0; j--) {
            if(s.charAt(j)==t) p = 0;
            else {
                p = p + 1;
                answer[j] = Math.min(answer[j], p);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main10 main = new Main10();
        Scanner in=new Scanner(System.in);
        String s = in.next(); //문자열
        char t = in.next().charAt(0);

        int[] result = main.solution(s, t);
        for(int r: result) {
            System.out.print(r+" ");
        }
    }
}

