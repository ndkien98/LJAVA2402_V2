package com.t3h.buoi14;

import java.util.Stack;

/**



    - ArrayList
        - lưu trữ một tập hợp các phần tử có cùng kiểu dữ liệu
        - nằm trên một vùng nhớ nằm liền kề nhau

    - Linked List danh sách liên kết kép
        - là cấu trức lưu trữ phân tán, dữ liệu sẽ được nằm trên các node nằm dải dác trong ô nhớ
        - node:
            pre-link: lưu địa chỉ ô nhớ của node phía trước
            value: lưu giá trị của ô nhớ
            next-link: lưu địa chỉ ô nhớ của node tiếp theo
    - Stack
        - là một cấu trúc lưu trữ dữ liệu tuyến tính, hoạt động với cơ chế vào trước ra sau
        - chi tiết:
            vào trước ra sau ( last in - first out)
        - cách triển khai:
            c1: Sử dụng mảng Array
                - tạo ra một mảng các phần tử, quy định cho mảng chỉ thêm hoặc xóa đi phần tử ở đầu mảng
            c2: Sử dụng danh sách liên kết (Linked List)
                - tạo một danh sách các node, chỉ thêm hoặc lấy ra phần tử ở đầu node

    - Queue
        - là một cấu trúc lưu trữ dữ liệu tuyến tính với cơ chế hoạt động vào trước ra trước(first in - first out)
        - vd:
            xếp hàng mua vé xem phim
        - cách triển khai:
            c1: sử dụng mảng (array)
                sẽ một đầu
                    rear: chuyên đựa các cần tử vào hàng đợi
                    font: chuyên đưa các phần tử ra khỏi hàng đợi
            c2: sử dụng danh sách liên kết đơn
                     rear: chuyên đựa các cần tử vào hàng đợi
                     font: chuyên đưa các phần tử ra khỏi hàng đợi

 */
public class Main {
    public static void main(String[] args) {

        Stack<String> stackString = new Stack<>();
        // thêm các phần tử vào stack
        stackString.push("A");
        stackString.push("B");
        stackString.push("C");
        stackString.push("D");
        System.out.println("Duyệt stack: ");
        int i = 0;
        while (!stackString.isEmpty()){
            System.out.println("phần tử thứ: " + ++i + " : " + stackString.pop());
        }
        // Duyệt danh sách stack bằng for i và for each


    }
}
