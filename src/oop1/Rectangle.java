package oop1;

public class Rectangle {
    int width;
    int height;

    int getArea(){
        return width * height;
    }
    int calculatePerimeter(){
        return (width * 2 + height * 2);
    }
    boolean isSquare(){
     return (width == height) ? true : false;
    }
}
