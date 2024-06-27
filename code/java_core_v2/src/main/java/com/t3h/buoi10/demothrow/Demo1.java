package com.t3h.buoi10.demothrow;

public class Demo1 {
    static void validate(int age) {
        try {
            if (age < 18){
                // chủ động bắn ra lỗi khi số tuổi < 18
                throw new ArithmeticException("not valid");
            }else{
                System.out.println("welcome");
            }
        } catch (ArithmeticException ex) {
            // xử lý lỗi được bắn ra tại dòng lệnh số 6
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }

    /**
     return_type method_name() throws exception_class_name {
        / / code xử lý của method
     }

     */
}
