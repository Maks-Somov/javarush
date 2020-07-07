package com.company.levelFive.lesson7;

public class Rectangle {
    private int top = 0;
    private int left = 0;
    private int width = 0;
    private int height = 0;

    void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }

    void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    void initialize(Rectangle rectangle){
        this.top = rectangle.top;
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.left = rectangle.left;
    }


}
