package algowithjava.codeup.basic;

import java.util.Scanner;

public class SaveSoundFile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double h= sc.nextInt();
        double b= sc.nextInt();
        double c= sc.nextInt();
        double s= sc.nextInt();
        // 1KB 1024 byte
        // 1MB 1024 KB
        double output = (h*b*c*s)/8/1024/1024;

        //String format  0.11 => %.2f

        System.out.println(String.format("%.1f MB",output));
    }

}
