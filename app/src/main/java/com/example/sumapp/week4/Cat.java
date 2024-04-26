package com.example.sumapp.week4;

public class Cat {

private final int id;
    private final String name;
    private final String image;
    private final String birthday;
    private final double price;


    public Cat(int id, String name, String image, String birthday, int price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.birthday = birthday;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getBirthday() {
        return birthday;
    }

    public double getPrice() {
        return price;
    }
}
