package algowithjava.codeup.basic;

import java.util.Scanner;

public class DeungBee {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int r= sc.nextInt();
        int n= sc.nextInt();
        double dValue = (a*(Math.pow(r,n-1)));

        System.out.println(String.format("%.0f",dValue));

    }
    
}
