package com.theironyard;

/**
 * Created by michaelplott on 10/18/16.
 */
public class User {
    int id;
    String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
