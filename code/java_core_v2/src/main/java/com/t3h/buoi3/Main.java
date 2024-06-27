package com.t3h.buoi3;


import java.util.Scanner;

/**

 * Cấu trúc điều khiển if, else

 if(dieu_kien){
    // khối lệnh thực thi khi dieu_kien = true
 }else{
    // khối lệnh sẽ thực thi khi dieu_kien = false
 }

 if(dieu_kien1){

 }else if(dieu_kien2{

 }else if(dieu_kien...n){

 }else{

 }

 * Cấu trúc swich case

 Bai 4: Nhập vào một tháng trong năm. Hiển thị mùa cuâ tháng đó
     từ tháng 1,2,12 => mùa đông
     3 đến 5: mùa xuân
     6 đến 8 mùa hè
     9 đến 10 mùa thu
     sử dụng switch case

 * Cấu trúc vòng lặp
    - giúp thực hiện một công việc lặp đi lặp lại nhiều lần
    - cơ bản có 3 phần
        - khởi tạo điều kiện lặp
        - kiểm tra điều kiện lặp
                nếu trả về true => khối lệnh trong vòng lặp được thực thi
        - thay đổi điều kiện lặp
    - for:
        for(khoi_tao;kiem_tra;thay_doi_gia_tri){
            // khối lệnh được thực khi khi điều kiện kiểm tra = true
        }
    - while:
        khởi tạo điều kiện
        while(dien_kien){
            - // khối lệnh thực thi khi điều kiện đúng
            - thay đổi điều kiện
        }
    - do-while
        do{
            - // thực thi khổi lệnh
            - thay đổi điều kiện
        }while(dieu_kien);

 Bai 5: nhập vào n
 Nếu người dùng nhập vào số <0 sẽ bắt người dùng nhập lại dữ liệu cho tới khi số đã > 0
 a) tính tổng các số từ 1 đến n
 b) tính tổng các số chẵn
 c) in ra các số nguyên tố từ 1 đến n và tính tổng các số đó

 */
public class Main {
    public static void main(String[] args) {
        // nhập vào số x, in ra dãy số từ 1-x
        System.out.println("Nhập vào n");
        int x = new Scanner(System.in).nextInt();
        System.out.println("do - while");
        int s = 1;
        do {
            if (s == 3) {
                s++;
                continue;
            }
            if (s == 4) break;
            System.out.println(s);
            s++;
        }while (s <= x);
        int j=1;
        System.out.println("While");
        while (j <=x){
            if (j == 3){
                j++;
                continue;
            }
            if (j==4)
                break;

            System.out.println(j);
            j++;
        }
        System.out.println("For");
        for (int i=1;i <= x;i++){
            if (i == 3){
                // bỏ qua lần chạy
                continue;
            }
            if (i == 4){
                // thoát khỏi vòng lặp for
                break;
            }
            System.out.println(i);
        }
        System.out.println("Nhập vào số <=12 để phân biệt mùa ");
        int n = new Scanner(System.in).nextInt();
        switch (n){
            case 12:
            case 1:
            case 2:
                System.out.println("Mùa đông");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Mùa xuân");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Mùa hè");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Mùa thu");
            default:
                System.out.println("Bạn nhập sai mùa");
        }


        int a = 4;
        if (a % 2 == 0){
            System.out.println("1");
        }else {
            System.out.println("2");
        }

        if(a == 4){
            System.out.println("3");
        }else {
            System.out.println("4");
        }

        if (a % 2 == 0){
            System.out.println("5");
        }else if(a == 4){
            System.out.println("6");
        }else {
            System.out.println("7");
        }
    }
}
