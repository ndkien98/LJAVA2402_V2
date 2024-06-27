package com.t3h.buoi10.demoex;

public class Demo1 {
    public static void main(String[] args) {

        int a=50/0;	//ArithmeticException

        String s=null;
        System.out.println(s.length());	//NullPointerException

        String ab="abc";
        int i=Integer.parseInt(ab);//NumberFormatException

        int arr[]=new int[5];
        arr[10]=50; //ArrayIndexOutOfBoundsException

        /**
         try {
         // code có thể ném ra ngoại lệ
         } catch(Exception_class_Name ref) {
         // code xử lý ngoại lệ
         }
         */
        int c=0,b=0,ac=5;
        try{
            c=ac/b;
        }catch(Exception e){
            System.out.println("Lỗi chia cho 0: " + e.getMessage());
        }finally {

        }
        System.out.println("Sau phép chia");

        /**
         try {
            // code có thể ném ra ngoại lệ
         }catch(Exception e){
            // Khối lệnh xử lý lỗi
         }finally {
            // code trong khối này luôn được thực thi
         }
         */

        try {
            int data = 50 / 0; // lỗi tại dòng này
        } catch (ArithmeticException e) {
            System.out.println("Xử lý ngoại lệ chia cho 0: " + e.getMessage());
        }finally {
            System.out.println("Dù có lỗi hay không cũng sẽ thực thi đoạn code này");
        }
        System.out.println("rest of the code...");


    }

}
