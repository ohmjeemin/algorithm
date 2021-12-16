package algowithjava.inflearn.ch1;

import java.util.ArrayList;
import java.util.Scanner;


/*
* 회문 문자열
* 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
* 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES" 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하세요.
* 단 회문을 검사할 때 대소문자를 구분하지 않습니다...
* */
public class Main7 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();

        int lt = 0;
        int rt = str.length() -1;
        str.toCharArray();

        while(lt < rt) {

        }

        return answer.toString();
    }

    public static void main(String[] args){
        Main7 main = new Main7();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(main.solution(str));

    }
}

