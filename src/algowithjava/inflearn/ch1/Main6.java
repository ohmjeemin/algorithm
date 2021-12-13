package algowithjava.inflearn.ch1;

import java.util.Scanner;

/*
* 중복 문자 제거
* 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요
* 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
* */
public class Main6 {
    public String solution(String str) {
       StringBuilder answer = new StringBuilder();
       for(char x : str.toCharArray()) {

       }

        return answer.toString();
    }

    public static void main(String[] args){
        Main6 main = new Main6();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(main.solution(str));

    }
}

