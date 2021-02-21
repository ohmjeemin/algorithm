package algowithjava.codeup.basic;

import java.util.Scanner;

public class SaveImageFile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double w= sc.nextInt();
        double h= sc.nextInt();
        double b= sc.nextInt();

        // 1KB 1024 byte
        // 1MB 1024 KB
        double output = (w*h*b)/8/1024/1024;

        //String format  0.11 => %.2f
        System.out.println(String.format("%.2f MB",output));
    }
}
