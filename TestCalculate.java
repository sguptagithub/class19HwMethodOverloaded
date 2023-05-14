package Class19HwMethodsOverloaded;

import java.awt.*;

public class TestCalculate {

        public static void main(String[] args) {
            //Shape shape = new Shape();
            Calculate calulate=new Calculate();

            double rectangleArea = calulate.calculateAreaRectangle(4, 5);
            double squareArea = calulate.calculateAreaSquare(6);

            System.out.println("Rectangle Area: " + rectangleArea);
            System.out.println("Square Area: " + squareArea);
        }
    }


