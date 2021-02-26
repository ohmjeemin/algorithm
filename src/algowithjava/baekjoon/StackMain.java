package algowithjava.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class StackMain {

    public static void main(String [] args) {
        Stack stack = new Stack();

        Scanner sc = new Scanner(System.in);

        String operator = "";
        int ittr = sc.nextInt();
        int value;

        for(int i=0; i<ittr; i++) {
            operator = sc.next();
            switch(operator) {
                case "push": value = sc.nextInt(); stack.push(value); break;
                case "top":  System.out.println(stack.top()); break;
                case "size": System.out.println(stack.size()); break;
                case "empty":System.out.println(stack.empty()); break;
                case "pop":  System.out.println(stack.pop()); break;
            }
        }
    }
}

class Stack {

    ArrayList arrayList = new ArrayList();

    //1. push 정수 X를 스택에 넣는 연산이다
    public void push(int x) {
        //System.out.println("push..");
        arrayList.add(x);
    }
    //2. pop 스택에서 위에 정수를 빼고 출력함. 만약 스택에 요소 없으면 -1
    public int pop() {
        //System.out.println("pop..");
        if(arrayList.size()==0) return -1;
        else {
            int v = (int)arrayList.get(arrayList.size()-1);
            arrayList.remove(arrayList.size()-1);
            return v;
        }
    }
    //3. size 스택에 들어있는 정수의 개수를 출력한다
    public int size() {
       // System.out.println("size..");
        return arrayList.size();
    }
    //4. empty 스택이 비어있으면 1 아니면 0을 출력한다
    public int empty() {
       // System.out.println("empty..");
        if(arrayList.size()==0) return 1;
        else return 0;
    }
    //5. top 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어잇는 정수가 없는 경우에는 -1을 출력한다
    public int top() {
        if(arrayList.size()!=0) return (int)arrayList.get(arrayList.size()-1);
        else return -1;
    }
}