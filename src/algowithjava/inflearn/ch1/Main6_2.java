package algowithjava.inflearn.ch1;

import java.util.ArrayList;
import java.util.Scanner;


/*
* 중복 문자 제거
* 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요
* 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
* */
public class Main6_2 {
    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args){
        Main6_2 main = new Main6_2();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(main.solution(str));

    }
}

