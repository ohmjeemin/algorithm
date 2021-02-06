package algowithjava.codeup.basic;

import java.util.Scanner;

public class Hexa {
    public static void main(String[] args){

        String output ="";  // 최종 출력할 16진수

        Scanner sc=new Scanner(System.in);
        char input = sc.nextLine().charAt(0);
        //입력받은 char를 숫자로 변환
        int num = changeToInt(input);

        // i는 1~10 까지의 수
        // output 은 곱셈 결과(16진수)
        for(int i=1; i<=15; i++){
            output=changeHexa(num*i);

            if(i>9){
                System.out.println(input+"*"+changeToChar(i)+"="+output);
            }else{
                System.out.println(input+"*"+i+"="+output);
            }

        }

    }

    static int changeToInt(char c) {
        switch(c){
            case 'A' : return 10;
            case 'B' : return 11;
            case 'C' : return 12;
            case 'D' : return 13;
            case 'E' : return 14;
            case 'F' : return 15;
            default : return 0;
        }
    }

    static char changeToChar(int a) {
        switch(a){
            case 10 : return 'A';
            case 11 : return 'B';
            case 12 : return 'C';
            case 13 : return 'D';
            case 14 : return 'E';
            case 15 : return 'F';
            default : return 'L';
        }
    }

    // 받은 수를 16진법으로 나타낸다.
    static String changeHexa(int intValue){

        // 곱한 수가 16보다 작으면 숫자를 String 으로 변환하여 리턴
        if(intValue<16){
            return changeToChar(intValue)+"";
        }
        // 곱한 수가 16보다 크다 &&
        else{
            // 몫이 9 초과 -> 몫과 나머지를 체크하여 16 진법으로 변환
            if((intValue/16)>9){
                if((intValue%16)>9){
                    return changeToChar(intValue/16)+""+changeToChar(intValue%16)+"";
                }else{
                    return changeToChar(intValue/16)+""+(intValue%16)+"";
                }
            }
            // 몫이 9 이하 -> 나머지를 체크하여 16 진법으로 변환
            else{
                if((intValue%16)>9){
                    return (intValue/16)+""+changeToChar(intValue%16)+"";
                }else{
                    return (intValue/16)+""+(intValue%16)+"";
                }
            }
        }

    }
}
