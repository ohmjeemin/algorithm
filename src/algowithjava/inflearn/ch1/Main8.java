package algowithjava.inflearn.ch1;

import java.util.Scanner;


/*
* 유효한 팰린드롬
* 알파벳만 가지고 회문을 검사하고, 대소문자를 구분하지 않는다.
* */
public class Main8 {
    public String solution(String str) {
        // 1) 짝수 (i < str.length() / 2) 만큼 돌기
        // 2) 홀수도 가장 가운데는 상관 없으니까 짝수랑 똑같이 돈다.
        String answer = "NO";
        //replaceAll에 정규식 슬 수 있음
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args){
        Main8 main = new Main8();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(main.solution(str));

    }
}

