package algowithjava.codeup.basic;

import java.util.Scanner;

public class ThreeSixNine {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<n+1; i++) {
            if(i%3==0||i%6==0||i%9==0){
                System.out.print("X");
            }else{
                System.out.print(i);
            }

        }
    }



}
