package com.example.sumapp.week4;

public class User {

    private final String createdAt;

    private final String name;
    private final String avatar;
    private final String id;


    public User(String createdAt, String name, String avatar, String id) {
        this.createdAt = createdAt;
        this.name = name;
        this.avatar = avatar;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
