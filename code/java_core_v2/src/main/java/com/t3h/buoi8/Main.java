package com.t3h.buoi8;

import com.t3h.buoi8.demo.Animal;
import com.t3h.buoi8.demo.Cat;
import com.t3h.buoi8.demo.Dog;

import java.util.Scanner;

/**

 * Compile time:
    - là thời gian biên dịch code từ file .java -> .class
 * Run time:
    - là thơời điểm JVM thực thi code trong file .class

 */
public class Main {

    public static void main(String[] args) {
//        // Khơi tạo đối tượng đóng vai trò Animal
//        Animal animal1 = new Animal();
//        // hiển thị: Động vật đang kêu
//        animal1.tiengKeu();
//        // Khơi tạo đối tượng đóng vai trò Cat
//        animal1 = new Cat();
//        // hiển thị: Meo meo
//        animal1.tiengKeu();
//        // Khơi tạo đối tượng đóng vai trò Dog
//        animal1 = new Dog();
//        // Hiển thị: Gou Gou
//        animal1.tiengKeu();
//        System.out.println("--------------------upcasting");
//        // upcasting
//            Dog dog = new Dog();
//            dog.tiengKeu();
//            Animal animal = (Animal) dog;
//            animal.tiengKeu();
////            //down-casting
//            Animal animalCat = new Dog();
////            // instanceof: sử dụng để kiểm tra xem object có phải là instance của class đó hay không,
//            // hay có được tạo ra từ class đó hay không
//            if (animalCat instanceof Cat){
//                Cat cat = (Cat) animalCat;
//                cat.setMauLong("Trắng");
//                cat.tiengKeu();
//                System.out.println("ép kiểu animal sang cat thành công: " + cat.getMauLong());
//            }
//            Animal animalDog = new Dog();
//            if (animalCat instanceof Dog){
//                Dog dog1 = (Dog) animalDog;
//                dog1.tiengKeu();
//                System.out.println("Ép kiểu animal sang Do thành công");
//            }
            int n = 5;
            Animal[] animals = new Animal[5];
            for (int i = 0; i < n; i++) {
                System.out.println("Chọn 1 trong số các con vật ");
                System.out.println("1: Cat");
                System.out.println("2: Dog");
                int dongVat = new Scanner(System.in).nextInt();
                Animal animal = null;
                switch (dongVat){
                    case 1:
                        animal = new Cat();
                        if (animal instanceof Cat){
                            ((Cat) animal).setMauLong("Màu trắng");
                        }
                        animals[i] = animal;
                        break;
                    case 2:
                        animal = new Dog();
                        if (animal instanceof Dog){
                            ((Dog) animal).setCanNang(i + 10 + " kg");
                        }
                        animals[i] = animal;
                        break;
                    default:
                        animal = new Animal();
                }
                System.out.println(animal.toString());
            }
    }
}
