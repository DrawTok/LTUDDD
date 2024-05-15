package com.example.sumapp.week5;

public class User {

private final int idUser;
    private final String email;
    private final String fullName;
    private final String birthDay;
    private final String password;
    private final String image;
    private final String role;

    public User(int idUser, String email, String fullName, String birthDay, String password, String image, String role) {
        this.idUser = idUser;
        this.email = email;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.password = password;
        this.image = image;
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getPassword() {
        return password;
    }

    public String getImage() {
        return image;
    }

    public String getRole() {
        return role;
    }
}
