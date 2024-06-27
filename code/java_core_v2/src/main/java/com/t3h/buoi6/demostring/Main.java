package com.t3h.buoi6.demostring;

public class Main {

    /**
     String:
        + là một class được xây dựng sẵn để chuyên lưu trữ và lý các chuỗi ký tự trong Java
        + cung cấp rất nhiều hàm xử lý như cắt chuỗi, nối chuỗi, đảo ngược, tìm index...
        + Các chuỗi ký tự trong Java là bất biến, không thể thay đổi chiều dài, thay đổi chuỗi ...
        + Có thể coi mỗi String(Chuỗi ký tự) là một mảng các ký tự nhỏ
            => xử lý String tương tự như xử lý mảng

     * String được lưu trữ đặc trong vùng nhớ String Pool
        - String Pool:
            + là một vùng nhớ nhỏ nằm trong vùng nhớ Heap, chuyên lưu trữ giá trị chuỗi,
                    chỉ lưu trữ giá trị chuỗi
            + Trong String Pool chỉ lưu trữ một chuỗi giá trị duy nhất, không bao giờ có hai chuỗi ký tự giống nhau
                được lưu trữ trong String Pool
     vd:
         String s1 = "Cat";
         String s2 = "Cat";
     - biến s1 được khởi tạo theo kiểu literal => chuỗi "Cat" được lưu thẳng vào String Pool và s1 chứa địa chỉ ô nhớ của
     ô nhớ đó trong String Pool, hay nói cách khác s1 tham chiếu tới "Cat" trong String Pool
     - biến s2 cũng được khởi tạo theo kiểu literal => JVM sẽ kiểm tra nếu trong String Pool đã tồn tại chuỗi "Cat" chưa?
     nếu đã có => trả về trực tiếp địa ô nhớ chứa "Cat" cho s2, nếu chưa có => lưu chuỗi "Cat" mới => trả về địa chỉ ô nhớ
     của chuỗi "Cat" đó

     * Khởi tạo chuỗi:
        có hai cách khởi tạo chuỗi:
        + khởi tạo literal:
            + chuỗi ký tự sẽ được lưu trực tiếp vào String Pool
        + khởi tạo bằng từ khóa new: String s3 = new String("Cat");
            + JVM sẽ khởi tạo một vùng nhớ lưu trữ đối tượng String và có nội dung là "Cat", và chuỗi "Cat" đấy
            không nằm trong String Pool mà chỉ nằm trong ô nhớ chứa đối tượng String

     * So sánh chuỗi
        có 3 cách so sách chuỗi
        c1: Sử dụng dấu "==";
        c2: Sử dụng hàm equal();
        c3: Sử dụng hàm compareTo

     c1: Sử dụng dấu "=="
        - kiểu dữ liệu nguyên thủy ( int,long,float,...)
            + được sử dụng để so sánh giá trị, nếu giá trị bằng nhau => true và ngược lại
        - kiểu dữ liệu tham chiếu( kiểu object)
            + Được sử dụng để so sánh xem hai object có cùng địa chỉ ô nhớ hay không, nếu cùng địa chỉ
                ô nhớ => true và ngược lại
     c2: Sử dụng equal();
        - hàm equal là một hàm mặc định được cung cấp trong tất cả các class trong Java. Nó sẽ so sánh nội dung ( giá trị ) của hai biến
        nếu hai biến có cùng một giá trị => true ngược lại là false

     *  StringBuilder, StringBuffer
        - là các class được định nghĩa sẵn tương tự String, nhưng cung cấp cơ chế xử lý tốt hơn
        - Có thể thay đổi chuỗi vì hoạt động theo cơ chế lưu chuỗi trên mảng các ký tự char, như vậy nếu chỉnh sửa chuỗi
            sẽ chỉ thay đổi trên mảng ký tự. Chỉ khi gọi tới hàm toString() => mới tạo ra chuỗi trên String Pool => khi đó
            chuỗi mới mà chuỗi không thể thay đổi
        - Khuyến khích dùng StringBuilder, StringBuffer thay cho String vì xử lý tối ưu hơn và cho phép chỉnh sửa chuỗi,
            rất phù hợp với bài toán tooán tạo ra các chuỗi động
     *
     */

    public static void main(String[] args) {
        // khởi tạo literal:
        String a = "hello";
        // khởi tạo bằng từ khóa new:
        String b = new String("hello");

        String s1 = "Cat";
        String s2 = "Cat";
        String s4 = "Cat";
        s1.length(); // in ra chiều dài
        s1.equals("A"); // so sánh hai chuỗi
        s1.contains("A"); // kiểm tra xem chuỗi có chứa ký tự truyền vào ko
        s1.substring(1); // lấy ra chuỗi con từ chuỗi cha
        s1.replace("a","a"); // thay thế ký tự trong chuỗi bằng một ký tự khác
        s1.intern(); // trả về địa chỉ ô nhớ của chuỗi trong String Pool nếu có, nếu không thì lưu chuỗi đấy vào String Pool
        s1.split(","); // trả về mảng ký tự được ngăn cách bằng ký tự được truyền vào
        s1 = "Catt";
        s2 ="Catt";
        s2 = "A";
        /**
         vì biến s1
         */
        String s3 = new String("Cat");
        s3 = new String("Cat");
        s3 = new String("Cat");

        String demo1 ="Cat";
        String demo2 = "Cat";
        String demo3 = new String("Cat");
        System.out.println(demo1 == demo2); // true
        System.out.println(demo1 == demo3); // false

        System.out.println(demo1.equals(demo3)); // true
        System.out.println(demo1.equals(demo2)); // true

        StringBuilder stringBuilder = new StringBuilder("Javav");
        stringBuilder.append("java");

        StringBuffer stringBuffer = new StringBuffer("Javav");
        stringBuffer.append("A");
        stringBuffer.toString();


    }
}
