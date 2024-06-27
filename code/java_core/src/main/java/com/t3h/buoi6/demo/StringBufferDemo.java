package com.t3h.buoi6.demo;

import java.util.concurrent.CyclicBarrier;

public class StringBufferDemo {
    public static void main(String[] args) {
        long n = 1000000l;
        // Tạo một đối tượng StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        // Tạo một CyclicBarrier với 2 luồng đồng bộ hóa
        CyclicBarrier barrier = new CyclicBarrier(2);
        // Tạo một luồng để thêm chuỗi "Hello" vào StringBuffer
        Thread thread1 = new Thread(() -> {
            try {
                for (int i = 0; i <n ; i++) {
//                    barrier.await(); // Chờ tất cả các luồng khác đến điểm đồng bộ hóa
                    stringBuffer.append("Hello");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        // Tạo một luồng để thêm chuỗi " World" vào StringBuffer
        Thread thread2 = new Thread(() -> {
            try {
                for (int i = 0; i <n ; i++) {
//                    barrier.await(); // Chờ tất cả các luồng khác đến điểm đồng bộ hóa
                    stringBuffer.append("Hello");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Khởi động các luồng
        thread1.start();
        thread2.start();

        try {
            // Đợi cho đến khi cả hai luồng đã đến điểm đồng bộ hóa
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // In ra nội dung của StringBuffer sau khi các luồng đã thêm chuỗi
        System.out.println("Final content of StringBuffer: " + stringBuffer.toString());
    }
}
