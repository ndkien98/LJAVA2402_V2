package Bai1;

import java.util.Scanner;

public class Main {

    private int[] array;
    private int n;

    public Main() {
    }

    public Main(int n) {
        this.n = n;
        this.array = new int[n];
    }

    public void NhapVaoMang() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int eg;
            do {
                System.out.println("Nhap vao phan tu thu" + (i + 1) + "(phai lon hon 0): ");
                eg = scanner.nextInt();
            } while (eg <= 0);
            array[i] = eg;
        }
    }

    private void HienThi() {
        System.out.println("Mang da nhap: ");
        for (int eg : array) {
            System.out.println(eg + "");
        }
        System.out.println();
    }

    public int TongLe() {
        int sum = 0;
        for (int eg : array) {
            if (eg % 2 != 0) {
                sum += eg;
            }
        }
        return sum;
    }

    public int Count(int number) {
        int count = 0;
        for (int eg : array) {
            if (eg == number) {
                count++;
            }
        }
        return count;
    }


    private void SoSanhTangDan() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    private void SoSanhGiamDan() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    private int XoaPhanTu(int number) {
        int count = 0;
        for (int eg : array) {
            if (eg != number) {
                array[count++]= eg;
            }
        }
        return n = count;
    }

    private void MangSauKhiXoa(){
        System.out.println("Mang sau khi xoa: ");
        for (int i = 0; i < n; i++){
            System.out.println(array[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang: ");
        int n = scanner.nextInt();
//a b
        Main main = new Main(n);
        main.NhapVaoMang();
        main.HienThi();
//c
        System.out.println("Tong le cua cac phan tu trong mang: " + main.TongLe());
//d
        System.out.println("Nhap vao so muon kiem tra xem co bao lan xuat hien: ");
        int x = scanner.nextInt();
        System.out.println("So lan so X xuat hien: " + main.Count(x));
//e
        System.out.println("Sap xep theo thu tu tang dan: ");
        main.SoSanhTangDan();
        main.HienThi();
//f
        System.out.println("Sap xep theo thu tu giam dan: ");
        main.SoSanhGiamDan();
        main.HienThi();
//g
        System.out.println("Nhap vao mot phan tu, xoa phan tu da chon");
        int y = scanner.nextInt();
        main.XoaPhanTu(y);
        main.MangSauKhiXoa();
    }

}
