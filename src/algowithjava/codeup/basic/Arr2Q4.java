package algowithjava.codeup.basic;

import java.util.Scanner;

public class Arr2Q4 {
    public static void main(String [] args) {
        int[][] miropan = new int[10][10];


        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                miropan[i][j] = sc.nextInt();
            }
        }

        int spot;
        int right=1;
        int down=1;
        boolean run = true;

        miropan[1][1] = 9;
        int s = 1;
        int j = 1;
        while (s < 9 && j < 9) {
            if (miropan[s][j + 1] == 0) {
                miropan[s][j + 1] = 9;
                j++;
            }
            else if (miropan[s][j + 1] == 1 && miropan[s + 1][j] == 0) {
                miropan[s + 1][j] = 9;
                s++;
            }
            else if (miropan[s][j + 1] == 2) {
                miropan[s][j + 1] = 9;
                break;
            } else if (miropan[s][j + 1] == 1 && miropan[s + 1][j] == 2) {
                miropan[s + 1][j] = 9;
                break;
            } else if (miropan[s][j + 1] == 1 && miropan[s + 1][j] == 1) {
                break;
            }
        }
        for(int i=0; i<10; i++) {
            for(int k=0; k<10; k++) {
                System.out.print(miropan[i][k]+" ");
            }
            System.out.println("");
        }

    }
}

