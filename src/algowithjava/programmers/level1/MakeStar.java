package algowithjava.programmers.level1;

import java.util.Scanner;

public class MakeStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print("*");
                if(j==a-1)  System.out.print("\n");
            }
        }

    }
}
/*
kotlin
* fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var star : String = ""
    for(i in 1..a){
        star += "*"
    }

    for(i in 1..b){
        println(star)
    }

}

*
* */