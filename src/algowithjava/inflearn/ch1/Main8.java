package algowithjava.inflearn.ch1;

import java.util.Scanner;


/*
* 숫자만 추출
* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수 만듬
*
* */
public class Main8 {
    public String solution(String str) {
        // 1) 짝수 (i < str.length() / 2) 만큼 돌기
        // 2) 홀수도 가장 가운데는 상관 없으니까 짝수랑 똑같이 돈다.
        String answer = "";
        //replaceAll에 정규식 슬 수 있음
        for(char c: str.toCharArray()) {
            if(Character.isDigit(c)) answer += c;
        }

        return answer;
    }

    public static void main(String[] args){
        Main8 main = new Main8();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(main.solution(str));

    }
}

