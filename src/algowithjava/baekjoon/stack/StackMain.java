package algowithjava.baekjoon.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackMain {

    public static void main(String [] args) {

        Stack_back stack = new Stack_back();

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String operator = "";
        int ittr = sc.nextInt();    // 몇회 연산할건지
        String value="";

        List<String> list = new ArrayList<String>();
       // sc.nextLine(); // nextInt + nextLine 같이 쓰면 제대로 안됨
        // (nextInt는 개행해야지 넘어가고, nextLine은 개행도 입력으로 취급하기 때문)

//
//
//        for(int i=0; i<ittr; i++) {
//            operator = sc.next();
//            list.add(operator);
//        }

        String oper ="";
        for(int j=0; j<ittr; j++) {
            oper = sc.next();
//            if(list.get(j).contains("push")) {
//                oper = "push";
//                value = list.get(j);
//            }
            switch(oper) {
                case "push": stack.push(sc.nextInt());
                             break;
                case "top":  sb.append(stack.top()+"\n");
                             break;
                case "size": sb.append(stack.size()+"\n");
                             break;
                case "empty": sb.append(stack.empty()+"\n");
                             break;
                case "pop": sb.append(stack.pop()+"\n");
                             break;
            }
        }

        System.out.println(sb.toString());
    }
}

class Stack_back {

    ArrayList arrayList = new ArrayList();

    //1. push 정수 X를 스택에 넣는 연산이다
    public void push(int x) {

        arrayList.add(x);
    }
    //2. pop 스택에서 위에 정수를 빼고 출력함. 만약 스택에 요소 없으면 -1
    public int pop() {

        if(arrayList.size()==0) return -1;
        else {
            int v = (int)arrayList.get(arrayList.size()-1);
            arrayList.remove(arrayList.size()-1);
            return v;
        }
    }
    //3. size 스택에 들어있는 정수의 개수를 출력한다
    public int size() {

        return arrayList.size();
    }
    //4. empty 스택이 비어있으면 1 아니면 0을 출력한다
    public int empty() {

        if(arrayList.size()==0) return 1;
        else return 0;
    }
    //5. top 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어잇는 정수가 없는 경우에는 -1을 출력한다
    public int top() {
        if(arrayList.size()!=0) return (int)arrayList.get(arrayList.size()-1);
        else return -1;
    }
}