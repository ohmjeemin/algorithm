package algowithjava.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int loopCnt = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<loopCnt; i++) {
            String[] priceToCnt = br.readLine().split(" ");
            int itemPrice = Integer.parseInt(priceToCnt[0]) * Integer.parseInt(priceToCnt[1]);
            sum += itemPrice;
        }
        if(totalPrice == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
