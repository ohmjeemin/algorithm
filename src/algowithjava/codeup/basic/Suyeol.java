package algowithjava.codeup.basic;

import java.util.Scanner;

public class Suyeol {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int m= sc.nextInt();
        int d= sc.nextInt();
        int n= sc.nextInt();
        int count = 1;

        while(true){
            a = (a * m) + d;
            count++;
            if(count==n){
                System.out.println(a);
                return;
            }
        }

        }
}
