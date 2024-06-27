package com.t3h.buoi2;

import java.util.Scanner;

/**

 * Quy tắc đặt tên
    - tên package là các chữ cái in thường
    - Tên class sẽ có chữ cái đầu tiên viết hoa, các chữ cái sau sẽ viết hoa chữ cái đầu tiên
    - tên không được bắt đầu bằng số
    - tên có thể bắt đầu bằng ký tự "_", "$", chữ cái thông thường.
    - thông dụng hiện tại sẽ đặt tên theo quy tắm camlCase
    - không được trùng vào từ khóa

 * Biến:
    - là một thực thể có tên và xác định một ô nhớ trong bộ nhớ khi chạy chương trình Java, lưu trữ giá trị
        để chạy chương trình
    - giá trị trong biến có thể thay đổi
    - cách khai báo biến:
        kiểu_dữ_liệu tên_biến

 * gán giá trị cho biến:
    sử dụng dấu "=" để gán giá trị cho biến

 * Hằng:
   -  Là một biến đặc biệt, giá trị của hằng sẽ không thể thay đổi sau lần gán giá trị đầu tiên
    - cách khai báo hằng:
            final kiểu_dữ_liệu tên_hằng;
 2: các kiểu dữ liệu
    có hai loại kiểu dữ liệu:
    - nguyên thủy(primitive)
        + byte, int, long, double, float, char, boolean
    - kiểu dữ liệu tham chiếu(referent)
        + là các kiểu dữ liệu object được tạo ra từ các class
        + các biến lưu trữ kiểu dữ liệu này gọi là các biến tham chiếu
        + các biến tham chiếu sẽ lưu trữ địa chỉ ô nhớ của dữ liệu tham chiếu

 3: Các toàn tử:
    - toàn tử số học
         "+", "-","*",
         "/": chia lấy nguyên
         "%": chia lấy dư
    - toán tử gán: sử dụng dấu bằng
        + toán tử gán rút gọn
            +=
            /=
            %=
            -=
            *=
    - toán tử so sánh
        == : so sánh bằng
        != : so sánh khác
        > : so sánh lớn hơn
        < : so sánh nhở hơn
        >=, <= : lớn hơn hoặc bằng, nhỏ hơn hoặc bằng
    - toán tử logic:
        "&","&&": chỉ true khi tất cả đều true, nếu không sẽ false
        "|" : chỉ false khi tất cả cùng false, nếu không sẽ true
        "!" : đảo ngược giá trị logic
        "||":
    - toán tử 3 ngôi
        tổng quát:
         value= điều_kiện ? giá_trị_1 : giá_trị_2;
        value: kết quả cuối của toán tử 3 ngôi
        điều_kiện: điều kiện logic trong toán tử 3 ngôi, trả về true hoặc false
        giá_trị_1: trả về khi điều kiện = true
        giá_trị_2: trả về khi điều kiện = false
    vd:
         int p=10;
         int q= 5;
         int value = p >= q ? p : q;
         System.out.println(value);
    - toán tử tăng giảng
        ++x <=> x = x + 1 : thực hiện trước khi dòng code được chạy
        --x <=> x = x - 1 : thực hiện trước khi dòng code được chạy
        x++ <=> x = x + 1 : thực hiện sau khi dòng code được chạy
        x-- <=> x = x - 1 : thực hiện sau khi dòng code được chạy

 * Ép kiểu trong Java

 * Bài tập
    Bài 1:
         Viết một chương trình Java để tính diện tích và chu vi của hình chữ nhật.
         chiều dài và rộng nhập vào từ console
         Sử dụng các biến để lưu chiều dài và chiều rộng.
    Bài 2:
         Viết chương trình Java để kiểm tra một số nguyên có phải là số chẵn hay không.
         n là một số được nhập vào từ console
         Sử dụng toán tử % để kiểm tra phần dư.
 * Có hai loại biến
    - biến local ( biến cục bộ)
        thường được khai báo trong khối lệnh, constructorm method
        và chỉ sử dụng được ở trong nội khối đấy, không thể sử dụng được ở ngoài
    - biến global ( biến toàn cục)
        thường được khai báo như một field(thuộc tính của class),
        có thể sử dụng ở mọi hàm, thậm trí bên ngoài class
 * truyền param vào method có hai kiểu
    - truyền theo tham chiếu
        + đưa vào cả địa chỉ ô nhớ của biến => có thể thay đổi được giá trị của biến đấy triệt để
    - truyền theo tham trị
        + đưa và giá trị của biến => không thể thay đổi giá trị của biến sau khi đi qua hàm
    => Java chỉ cho phép truyền giá trị theo kiểu tham trị, không cho phép truyền theo tham chiếu

 */
public class Main {
    static int demoGlobal = 0;
    public static int tinhDienTich(int chieuDai,int chieuRong,int dienTich){
        dienTich = chieuDai * chieuRong;
        System.out.println("diện tích trong hàm: " + dienTich);
        System.out.println(demoGlobal);
        return dienTich;
    }
    // String[] args: mảng tham số truyền vào chương trình chính
    public static void main(String[] args){
        System.out.println(demoGlobal);
        int chieuDai = 4;
        int chieuRong = 2;
        int dienTich = 0;
        dienTich = Main.tinhDienTich(chieuDai,chieuRong,dienTich);
        System.out.println("diện tích sau khi ra khỏi hàm: " + dienTich);


        int demo = 10;
        long demoLong = demo; // ép kiểu ko tường minh từ int -> long
        long demoLong2 = (long) demo; // ép kiểu tường minh int  -> long
        System.out.println(demoLong + " " + demoLong2);
        long demoLong3 = 1000000000000l;
        short demoShort = (short) demoLong3;
        long demoLong4 = 20;
        short demoShort1 = (short) demoLong4;
        System.out.println("demoShort: " + demoShort);
        System.out.println("demoShort1: " + demoShort1);



        int x = 2;
        int y = 3;
        x++; //
        y--;
        int z = ++x + y; // 6
        int e = z-- - y; // 2
        int d = ++x > y ? z : e;  // (2,6)
        System.out.println(z + " " + e + " " + d);


        int p=10;
        int q= 5;
        int value = p >= q ? p : q;
        System.out.println(value);

        boolean dataTrue = true;
        boolean dataTrue1 = true;
        boolean dataFalse = false;
        boolean dataFalse1 = false;
        System.out.println(dataTrue & dataTrue1); // true
        System.out.println(dataTrue & dataFalse); // false
        System.out.println(!(dataTrue & dataFalse)); // true
        System.out.println(!(dataTrue || dataFalse)); // false
        System.out.println(!(dataTrue || dataTrue));// false

        int i = 8;
        i+=2; // <=> i = i + 2;
//        int x = 20;
        x*=2;
//        System.out.println(i + " " + x);
//        System.out.println(x == i); // false
//        System.out.println(x > i); // true
//        System.out.println(x < i); // false



        int soDu = 9%2;
        System.out.println(soDu);
        int soNguyen = 9/2;
        System.out.println(soNguyen);

        char kyTuA = 65;
        System.out.println(kyTuA);

        // cách khai báo biến tham chiếu
        /**
         str:
            lưu trữ bên vùng nhớ stack memory, l
            ưu địa chỉ ô nhớ của object new String("a");
         object new String("a"):
            đối tượng String, nằm trong vùng nhớ heap Memory
         */
        String str = new String("a");


        final float hangSo = 3.14f;
//        hangSo = 10; error

        int _9aaa = 10;
        int $9aaa = 10;
        int soDiem = 10;
        int so_diem = 10;


//        Scanner scanner = new Scanner(System.in);
//        // Hiển thị thông tin lên màn hình console
//        System.out.println("Nhập vào số a: ");
//        // Thu thập thông tin từ console
//        int a = scanner.nextInt();
//        System.out.println("Nhập vào số b: ");
//        int b = scanner.nextInt();
//        int tong = Main.congHaiSo(a,b);
//        System.out.println("tổng hai số là: " + tong);
    }

    // Khai báo method: kiểu_dữ_liệu_trả_về tên_hàm(danh_sách_tham_số_truyền_vào){
    // thân hàm
    //}

    public static int congHaiSo(int a,int b){
        return a + b;
    }


}


