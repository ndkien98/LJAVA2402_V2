package org.example.buoi5;

import java.util.*;

public class Array {
    public void testLap() {
        Scanner scanner = new Scanner(System.in);
        int[] aInts = {};
        int a = 0;

        do {
            System.out.println("Mời Bạn Nhập Chức Năng:");
            System.out.println("Nhập 1 thêm mang n danh sách đã nhâp");
            System.out.println("Nhập 2 Hiển thị phần tử có giá trị lớn nhất");
            System.out.println("Nhập 3 tính tổng số lẻ trong mảng");
            System.out.println("Nhập 4 Nhập số Bất kì xem có bao nhiêu số giống số vừa nhập");
            System.out.println("Nhập 5 Sắp sếp mảng từ bé đến lớn");
            System.out.println("Nhập 6 Sắp sếp mảng từ lớn đến bé");
            System.out.println("Nhập 7 Cho Người Dùng Nhập vào 1 số xóa số đó trong mảng");
            System.out.println("Nhập 8 Thoát");


            a = scanner.nextInt();
            switch (a) {
                case 1:

                    System.out.println("Mời bạn nhập vào 1 số:");
                    int numberToAdd = scanner.nextInt();
                    if(numberToAdd<=0){
                        System.out.println("hãy nhập số lơn hơn 0");
                        break;
                    }
                    aInts = new int[numberToAdd];
                    for (int i = 0; i < numberToAdd; i++) {
                        System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                        aInts[i] = scanner.nextInt();
                    }


                    break;
                case 2:
                    System.out.println("Danh sách các phần tử đã nhập:");
                    for (int i = 0; i < aInts.length; i++) {
                        System.out.print(aInts[i] + " ");
                    }
                    break;
                case 3:

                    int tam = 0;

                    for (int i = 0; i < aInts.length; i++) {
                        if(aInts[i]%2 !=0){
                            tam +=aInts[i];
                        }
                    }
                    System.out.println("Tổng số lẻ là  :"+ tam);


                    break;
                case 4:
                    System.out.println("Mời bạn nhập số :");
                    int b;
                    b=new Scanner(System.in).nextInt();
                    int count = 0;
                    for (int n = 0; n < aInts.length; n++) {
                          if (aInts[n]==b){
                              count++;
                        }
                    }
                    System.out.println("Số lượng trùng nhau là :" + count);

                    break;
                case 5:
                    int tam2;
                    for (int n = 0; n < aInts.length; n++) {
                        for (int j = n + 1; j < aInts.length; j++) {
                            if (aInts[n] > aInts[j]) {
                                // đổi chỗ
                                tam2 = aInts[n];
                                aInts[n] = aInts[j];
                                aInts[j] = tam2;
                            }
                        }
                    }
                    System.out.println("mảng sau khi sắp sếp là :");
                    for (int num :aInts){
                        System.out.println(num);
                    }
                    break;
                case 6:
                    int tam3;
                    for (int n = 0; n < aInts.length; n++) {
                        for (int j = n + 1; j < aInts.length; j++) {
                            if (aInts[n] < aInts[j]) {
                                // đổi chỗ
                                tam3 = aInts[n];
                                aInts[n] = aInts[j];
                                aInts[j] = tam3;
                            }
                        }
                    }
                    System.out.println("mảng sau khi sắp sếp là :");
                    for (int num :aInts){
                        System.out.println(num);
                    }
                    break;
                case 7:
                    System.out.print("Nhập phần tử cần xóa: ");
                    int x = scanner.nextInt();
                    // Tạo một biến boolean để kiểm tra xem có phần tử trùng lặp không
                    boolean found = false;

                    // Duyệt qua mảng và xóa các phần tử trùng lặp
                    int newSize = 0; // Kích thước mới của mảng sau khi xóa
                    for (int i = 0; i < aInts.length; i++) {
                        if (aInts[i] != x) {
                            aInts[newSize] = aInts[i];
                            newSize++;
                        } else {
                            found = true;
                        }
                    }

                    // Kiểm tra xem có phần tử trùng lặp nào không
                    if (found) {
                        // In ra mảng sau khi xóa các phần tử trùng với x
                        System.out.println("Mảng sau khi xóa các phần tử trùng với " + x + " là:");
                        for (int i = 0; i < newSize; i++) {
                            System.out.print(aInts[i] + " ");
                        }
                    } else {
                        // Nếu không có phần tử trùng lặp, thông báo cho người dùng
                        System.out.println("Không có phần tử trùng lặp với " + x + " trong mảng.");
                    }

                    break;

           default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (a != 8);
    }
    public static boolean timSoBatKy(int n,int[] arr){
        boolean timThay = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                timThay=true;
                break;
            }
        }
        return timThay;
    }
    public static int[] themVaoMang(int[] arr, int soMoi) {
        // Tạo một mảng mới với kích thước lớn hơn mảng ban đầu một đơn vị
        int[] newArr = new int[arr.length + 1];

        // Sao chép các phần tử từ mảng ban đầu sang mảng mới
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // Thêm phần tử mới vào vị trí cuối cùng của mảng mới
        newArr[newArr.length - 1] = soMoi;

        // Trả về mảng mới
        return newArr;
    }

}
