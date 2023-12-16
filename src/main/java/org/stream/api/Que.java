package org.stream.api;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Que {

    public static void main(String[] args) {

        Queue<Integer> queue=new LinkedList<>();

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<12;i++){
            queue.add(i);

            stack.add(i);
        }




//        while(queue.size()!=0){
//           // System.out.println(queue.poll());
//
//            int front=queue.peek();
//            System.out.println(front);
//            queue.remove();
//        }

        while (stack.size()!=0){
            int i=stack.peek();
            System.out.println(i);
            stack.pop();
        }


    }
}
