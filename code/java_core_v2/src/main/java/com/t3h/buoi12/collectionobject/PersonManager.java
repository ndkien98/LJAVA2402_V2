package com.t3h.buoi12.collectionobject;

import java.util.*;

public class PersonManager {

    private List<Person> listPerson = new ArrayList<Person>();

    public void hienThiDanhSach(List<Person> listPerson) {
        if (listPerson == null){
            listPerson = this.listPerson;
        }
        for (Person person : listPerson) {
            System.out.println("id: " + person.getId() + " | name: " + person.getName());
        }
    }

    public void khoiTaoMacDinh(){
        for (int i = 0; i < 3; i++) {
            // Tạo ra person ngẫu nhiên
            Person person = new Person();
            person.setId(i + 1);
            person.setName("name " + (i + 1));
            // Thêm person vào
            listPerson.add(person);
        }
    }

    public void themMoiPerson(){
        Person person = new Person();
        System.out.println("Nhập vào thông tin person: ");
        System.out.println("Nhập vào id: ");
        int id = new Scanner(System.in).nextInt();
        person.setId(id);
        System.out.println("Nhập vào thông tin tên: ");
        String name = new Scanner(System.in).nextLine();
        person.setName(name);
        if(listPerson.contains(person)){
            System.out.println("Đã tồn tại person hại tại trong list");
            return;
        }
        listPerson.add(person);
        System.out.println("Đã thêm thành công");
    }

    public void xoaTheoTen(){
        System.out.println("Nhập vào tên muốn xóa: ");
        String ten = new Scanner(System.in).nextLine();
        Person doiTuongMuonXoa = null;
        for (Person person : listPerson) {
            if (person.getName().equalsIgnoreCase(ten)){
                doiTuongMuonXoa = person;
            }
        }
        // Thuc hien xoa
        if (doiTuongMuonXoa != null){
            listPerson.remove(doiTuongMuonXoa);
        }
    }

    public void sapXepTheoId(){

        // Thuc hien sap xep tren listPeopleCopy
        listPerson.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }
        });
        hienThiDanhSach(listPerson);
    }

}
