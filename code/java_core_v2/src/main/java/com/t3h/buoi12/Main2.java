package com.t3h.buoi12;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        // Khai báo một danh sách các số tự nhiên
        // Sử dụng List
        List<Integer> arrI = new ArrayList<>(); // ArrayList là class implement interface List => để tạo ra 1 List sẽ phải sử dụng class ArryList
        // Thêm mới phần tử vào list
        arrI.add(1);
        arrI.add(2);
        arrI.add(3);
        arrI.add(3);
        // Hiển thị dữ liệu trong List
        // arrI.size(): trả về số lượng các phần tử hiện có trong List
        for (int i = 0; i < arrI.size(); i++) {
            // Truy cập các phần tử trong list, sử dụng index : sử dụng hàm get để lấy ra phần tử theo index i
            int data = arrI.get(i);
            System.out.println(data);
        }
        // Set: có thể lưu tru danh sách các phần tử, nhưng không lưu trữ các phần tử trùng nhau '
        // Set là interface, HashSet là class implement interface Set => để khởi tạo Set có thể sử dụng class HashSet
        Set<Integer> setI = new HashSet<>();
        setI.add(1); // thêm các phần tử vào Set
        setI.add(2);
        setI.add(3);
        setI.add(3);
        System.out.println("Danh sách phần tử trong Set");
        for(Integer data : setI) {
            System.out.println(data); // duyệt các phần tử trong Set
        }
        // SortedSet
        SortedSet sortedSetI = new TreeSet();
        sortedSetI.add(4);
        sortedSetI.add(2);
        sortedSetI.add(1);
        sortedSetI.add(4);
        // Hiển thị Set bằng Iterator
        System.out.println("Hiển thị dữ liệu trong SortedSet bằng Iterator");
        Iterator<Integer> integerIterator = sortedSetI.iterator(); // chuyển sortedSetI thành Iterator
        while (integerIterator.hasNext()){
            Integer data = integerIterator.next(); // lấy ra lần lượt các phâần tử trong Iterator
            System.out.println(data);
        }
        /**
         Map: có cấu trúc là 2 phần:
            1) key
            2) value
         - ứng với mỗi key sẽ chỉ có 1 value tương ứng đi theo
         - để lấy ra được value bắt buộc phải sử dụng đúng key tương ứng
         lưu ý: sử dụng map để tìm kiếm phần tử trong danh sách sẽ nhanh hơn List, Set
         */
        Map<String,Integer> mapInteger = new HashMap<>();
        mapInteger.put("a",1); // Thêm phần tử có key=a, value = 1 vào mapInteger
        mapInteger.put("b",2);
        mapInteger.put("c",3);
        System.out.println("Hiển thị danh sách dữ liệu trong Map");
        /**
         Entry<Key,Value> : tượng trưng cho một phần tử trong map
         mapInteger.entrySet() : convert tất cả các phần tử trong map thành một Set<Entry>
         */
        for (Map.Entry<String,Integer> entry: mapInteger.entrySet()){
            System.out.println("key: " + entry.getKey() + " | value: " + entry.getValue());
        }
    }
}
