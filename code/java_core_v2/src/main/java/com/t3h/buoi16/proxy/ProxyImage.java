package com.t3h.buoi16.proxy;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String url;

    public ProxyImage(String url){
        this.url = url;
        System.out.println("Khởi tạo tạm url image, chưa khởi tạo real image");
    }

    @Override
    public void showImage() {
        if (realImage == null) {
            realImage = new RealImage(url);
        }else {
            System.out.println("Image đã được load lên trước đó: " + url);
        }
        realImage.showImage();
    }
}
