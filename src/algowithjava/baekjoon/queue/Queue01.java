package algowithjava.baekjoon.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Queue01 {
    public static void main(String[] args) throws Exception {

        // arraylist로 하는게 모양..
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            List<Integer> list = new ArrayList<>();
            int cnt = Integer.parseInt(br.readLine());
            for(int i=0; i<=cnt; i++) {
                String[] arr =  br.readLine().split(" ");
                switch(arr[0]) {

                    case "push": list.add(Integer.parseInt(arr[1])); // list의 맨마지막에 추가
                        break;
                    case "pop": list.remove(list.size()-1);
                        break;
                    case "size": sb.append(list.size()); break;
                    case "empty": sb.append(list.size()==0); break;
                    case "front": break;
                    case "back" : break;

                }
            }



        }catch(Exception e) {
            System.out.println(e.getMessage());
        }


    }



}

