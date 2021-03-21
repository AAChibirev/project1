package javaTasksOOP2;

import java.util.Arrays;
import java.util.Scanner;

public class MainClassPart2 {

    public static void main(String[] args){
        //For checking some class uncomment the line

        //#1.MyComplex
        //checkMyComplex();

        //#2.MyPolynomial
        //checkMyPolynomial();

        //#3.Ball and Container
        //checkBallAndContainer();
    }

    public static void checkMyComplex(){
        //MyComplex
        MyComplex complex1 = new MyComplex(4,0);
        MyComplex complex2 = new MyComplex(0,-1);

        System.out.println("Multiplication of "+ complex1.toString() + " and " +
                complex2.toString() + " = " + (complex1.multiplyNew(complex2)).toString());
        System.out.println("Division of "+ complex1.toString() + " and " +
                complex2.toString() + " = " +(complex1.divide(complex2)).toString());
    }

    public static void checkMyPolynomial(){
        //MyPolynomial
        double[] coeffs1 = {2, 2, 0, -4, 3, 2, 9};
        double[] coeffs2 =     {1, 0, 0, 0, 0, 9, 2};

        MyPolynomial myPolynomial1 = new MyPolynomial(coeffs1);
        MyPolynomial myPolynomial2 = new MyPolynomial(coeffs2);
        System.out.println(myPolynomial1.toString());
        System.out.println(myPolynomial2.toString());
        System.out.println("Multiply myPoly1 and myPoly2: " + myPolynomial1.multiply(myPolynomial2).toString());
    }

    public static void checkBallAndContainer(){
        //Ball and Container
        Ball ball = new Ball(5,4,1,1,45);
        System.out.println(ball.toString());

        Container container = new Container(0,0,10,10);

        int step = 0;

        //if ball > container
        if ((ball.getRadius()*2 > container.getWidth()) || (ball.getRadius()*2) > container.getHeight()){
            System.out.println("Ball is more than container");
            return;
        }

        //15 movements of ball
        for(int i = 0; i <15;i++){
            if(container.collidesWithHorizontalBorder(ball)){
                ball.reflectHorizontal();
            }
            if(container.collidesWithVerticalBorder(ball)){
                ball.reflectVertical();
            }
            step++;
            System.out.printf("Step %d: ", step);
            ball.move();
        }
    }
}
