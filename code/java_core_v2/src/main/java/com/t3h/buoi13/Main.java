package com.t3h.buoi13;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**

 - Map Interface
    Map là mot cấu trúc lưu trữ dữ liệu theo dạng Key, Value
    mỗi phần tử trong map được goi là một Entry
    cấu trúc Entry:
                key: tự định nghĩa kiểu dữ liệu, dữ liệu
                value: tự định nghĩa kiểu dữ liệu, dữ liệu
    + đặc điểm:
        - các key trong map là duy nhất => tìm kiếm phần tử thông qua key rất nhanh, tương tụ như index trong array
        - chỉ có thể laasy ra được value dựa vào key
        - mỗi value sẽ thuộc về mot key duy nhất


 */
public class Main {
    public static void main(String[] args) {

        // khoi tạo một map với Key có hiểu dữ liệu Integer la id, Value có kiểu dữ liệu Person
        Map<Integer, Person> mapIdPerson = new HashMap<Integer, Person>();
        // thêm mot phần tử vào map
        for (int i=0;i<5;i++){
            Person person = new Person();
            person.setId(i);
            person.setName("name"+i);
            // sử dụng hàm put để thêm một Entry( phần tử) vào map
            mapIdPerson.put(person.getId(), person);
        }
        // lấy ra value có key = 0
        mapIdPerson.get(0);

        // xóa đi phần tử có key=0
        mapIdPerson.remove(0);
        // lấy ra tập hợp tất cả các key trong map
        Set<Integer> setKeyIds =  mapIdPerson.keySet();
        // lấy ra tất cả phần entry trong map
        Set<Map.Entry<Integer,Person>> entrySet= mapIdPerson.entrySet();
        // duyệt map
        for (Map.Entry<Integer,Person> entry:entrySet){
            Integer key = entry.getKey();
            Person valuePerson = entry.getValue();
            System.out.println("key: " + key + " value: " + valuePerson.toString());
        }
        // Cho người dùng nhập vào Id => tìm kiếm person theo Id đó ?
        System.out.println("Nhập vào id muốn tìm kiếm: ");
        int id = new Scanner(System.in).nextInt();
//        Person person = null;
//        for (Map.Entry<Integer, Person> entry:mapIdPerson.entrySet()){
//            if (id == entry.getKey()){
//                person = entry.getValue();
//            }
//        }
        Person person = mapIdPerson.get(id);
        if (person != null){
            System.out.println("ket qua tim kiem la: " + person.toString());
        }else {
            System.out.println("Không tìm thấy data với id là: " + id);
        }
    }
}
