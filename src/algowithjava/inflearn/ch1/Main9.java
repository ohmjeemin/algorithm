package algowithjava.inflearn.ch1;

import java.util.Scanner;


/*
* 숫자만 추출
* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수 만듬
*
* */
public class Main9 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for(char c: str.toCharArray()) {
            if(Character.isDigit(c)) answer.append(c);
        }
        while(answer.charAt(0)=='0') {
            answer.delete(0,1);
        }
        return answer.toString();
    }

    public static void main(String[] args){
        Main9 main = new Main9();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(main.solution(str));

    }
}

