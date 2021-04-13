package com.ah_abdelhak.commondesignpattern.Singleton.Java;

public class JavaSingleton {
    private int id;
    private String text;
    private static JavaSingleton instance = null;

    // Private constructor to prevent instance creation outside this class
    private JavaSingleton() {
    }

    // Public method to be able to get instance of class
    public static JavaSingleton getInstance() {
        if (instance == null) {
            synchronized (JavaSingleton.class) {
                if (instance == null) {
                    instance = new JavaSingleton();
                }
            }
        }
        return instance;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }
}