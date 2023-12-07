package oop1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 5;

//      넓이
        int area = rectangle.getArea();
        System.out.println("넓이 = " + area);
//      둘레
        int areaPerimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 = " + areaPerimeter);
//      정사각형 여부
        if(rectangle.isSquare()){
            System.out.println("정사각형 입니다!");
        }
        else {
            System.out.println("정사각형 아닙니다ㅠㅠㅠㅠ");
        }
    }
}
