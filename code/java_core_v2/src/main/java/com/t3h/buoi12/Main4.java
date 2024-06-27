package com.t3h.buoi12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        List<Integer> list  = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        list.remove(1); // xóa đi phần tử = 1 trong list
        hienThi(list);

        boolean demoContains = list.contains(2); // kiểm tra xem có tồn tại phần tử 2 trong list không, nếu có sẽ = true, không =false
        System.out.println(demoContains);

        list.addAll(list2); // Thêm tất cả các phần tử trong list2 vào list
        hienThi(list2);

        int sizeList = list.size(); // lấy ra số lượng phần tử hiện có trong list
        System.out.println(sizeList);

        list.sort(new Comparator<Integer>() { // sắp xếp các phần tử trong list
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1 : -1;
            }
        });
        hienThi(list);

        List<Integer> list3 = list.subList(1,3); // lấy ra list con từ lst cha
        hienThi(list3);

        list.clear(); // giải phóng list, xóa đi các phần tử trong List
    }

    public static void hienThi(List list){
        System.out.println("Hiển thị danh sách: ");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
