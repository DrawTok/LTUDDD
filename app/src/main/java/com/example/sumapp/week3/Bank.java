package com.example.sumapp.week3;

public class Bank {
    final private String bankName;
    final private int image;
    final private String founding;

    public Bank(String bankName, int image, String founding) {
        this.bankName = bankName;
        this.image = image;
        this.founding = founding;
    }

    public String getBankName() {
        return bankName;
    }


    public int getImage() {
        return image;
    }



    public String getFounding() {
        return founding;
    }


}
