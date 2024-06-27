package com.t3h.buoi13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
    ArrayList:
        đặc điểm
            - triển khai theo cấu trúc mảng động, chứa các phần tử có cùng kiểu dữ liệu với nhau
            - các phần tử dữ liệu nằm liền ke nhau
            - tìm kiếm phần tử thông qua index
        điểm mạnh:
            - tìm kiếm phần tử nhanh, vì khi có index sẽ có thể truy xuất được ra giá trị mong muốn
            - dễ triển khai, ít bị mất mát dữ liệu
        điểm yếu:
            - khi thêm, xóa đi giá trị sẽ mất nhiều thời gian và tài nguyên
        dùng khi:
            - lưu trữ các giá trị cần tìm kiếm, truy xuất,
            - triển khai nhanh chóng, không phức tạp
    Linked List:
        Đặc điểm
            - Các phần tử dữ liệu được lưu trữ phân tán trong vùng nhớ, các phan tử không nằm liền kề nhau
            - các phần tử lưu trữ dữ liệu trong các node:
                cấu trúc của moi node:
                     + danh sách liên kế đơn có hai phần:
                            value: lưu trữ giá trị của node
                            next_address: lưu trữ địa chỉ ô nhớ của node tiếp theo
                    + danh sách liên kết đôi có 3 phần
                            pre_address: lưu trữ địa chỉ ô nhớ của node phía trước
                            value: luu trữ giá trị của node
                            next_address: lưu trữ địa chỉ ô nhớ của node phía sau
        Điểm mạnh:
            - tối ưu vùng nhớ lưu trữ do không bắt buộc phải có các ô nhớ nằm liền kề nhau
            - các action thêm, xóa đi phần tử trong danh sách sẽ nhanh hơn ArrayList
        Điểm yếu:
            - khó triển khai
            - rễ mất mast dữ liệu khi quản lý các node và địa chỉ ô nhớ ko tốt
        dùng khi:
            - cần lưu trữ dữ liệu tối ưu
            - có nhiều thao tác thêm, xóa dữ liệu trong mảng




 */
public class Main3 {

    public static void main(String[] args) {

        Long a =10l;
        Double b = 10.0;
        Float c = 10.0f;

        ArrayList<Integer> listInteger = new ArrayList();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(null);

        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);

//        for (int i = 0; i < 10; i++) {
//            Person person = new Person();
//            person.setId(i);
//            person.setName("name" + i);
//            listPerson.add(person);
//        }
        // Làm thế nào để collection xác định được thế nào là hai phần tử
        // giong nhau
        ArrayList<Person> listPerson = new ArrayList();
        Set<Person> personSet = new HashSet();

        Person p1 = new Person();
        p1.setId(1);
        p1.setName("name" + 1);

        Person p2 = new Person();
        p2.setId(1);
        p2.setName("name" + 1);

        personSet.add(p1);
        personSet.add(p2);
        personSet.remove(p1);
        personSet.contains(p1);
        personSet.size();
        personSet.addAll(new HashSet<>());

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.remove(p1);
        listPerson.contains(p2);
        listInteger.size();
        listInteger.addAll(new ArrayList());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.get(1);
        linkedList.addAll(new LinkedList<>());
        linkedList.size();


//        listPerson.remove(p2);

        Person p3 = new Person();
        p3.setId(1);
        p3.setName("name" + 1);
        listPerson.remove(p3);
        System.out.println(" số lượng phần tử trong set: " + personSet.size());
        System.out.println(" số lượng phần tử trong list: " + listPerson.size());
    }
}
