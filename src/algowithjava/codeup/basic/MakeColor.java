package algowithjava.codeup.basic;
import java.util.*;

public class MakeColor {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int r= sc.nextInt();
        int g= sc.nextInt();
        int b= sc.nextInt();
        int count = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<g; j++){
                for(int k=0; k<b; k++){
                    System.out.println(i+" "+j+" "+k);
                    count ++;
                }
            }
        }
        System.out.println(count);
    }

}
