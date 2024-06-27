package com.t3h.buoi14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main2 {

    public static void main(String[] args) {
        // Hàng đợi ban đầu: [A,B,C,D]
        Queue<String> queueString = new LinkedList<String>();
        queueString.offer("A");
        queueString.offer("B");
        queueString.offer("C");
        queueString.offer("D");

        System.out.println("Hàng đợi: " + queueString);
        System.out.println("Duyệt hàng đợi: ");
        Stack<String> stringStack = new Stack<>();
        while (!queueString.isEmpty()){
            String phanTuQueue = queueString.poll(); // lấy ra phần tử đầu tiên của hàng đợi
            // đưa phần tử đó vào stack
            stringStack.push(phanTuQueue);
        }
        System.out.println("Danh sách data stack: ");
        // làm sao để hiển ngược lại : [A, B, C, D] -> [D,C,B,A] ? dùng Stack ?
        while (!stringStack.isEmpty()){ // kiểm tra stack đã rỗng hay chưa, nếu chưa rỗng => = true
            System.out.print(stringStack.pop() + " "); // lấy ra phần tử đầu tiên của Stack
        }
    }
}
