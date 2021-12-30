package algowithjava.inflearn.ch1;

import java.util.Scanner;


/*
* 회문 문자열
* 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
* 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES" 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하세요.
* 단 회문을 검사할 때 대소문자를 구분하지 않습니다...
* */
public class Main7 {
    public String solution(String str) {
        // 1) 짝수 (i < str.length() / 2) 만큼 돌기
        // 2) 홀수도 가장 가운데는 상관 없으니까 짝수랑 똑같이 돈다.
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main7 main = new Main7();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(main.solution(str));

    }
}

