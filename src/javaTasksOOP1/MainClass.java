package javaTasksOOP1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        //For checking some class uncomment the line

        //#1.Circle
        //checkCircle();

        //#2.Rectangle
        //checkRectangle();

        //#3.Employee
        //checkEmployee();

        //#4.Book and Author
        //checkBookAndAuthor();

        //#5.MyPoint
        //checkMyPoint();

        //#6.MyTriangle
        //checkMyTriangle();

    }
    public static void checkCircle(){
        //Circle
        Circle circle = new Circle(4,"blue");
        System.out.println(circle.toString() + " with area " + circle.calculateArea());
    }

    public static void checkRectangle(){
        //Rectangle
        Rectangle rectangle = new Rectangle(10,4);
        System.out.println(rectangle.toString() +
                " with area: " + rectangle.calculateArea() +
                " and perimerer: " + rectangle.calculatePerimeter());

    }

    public static void checkEmployee(){
        //Employee
        Employee employee = new Employee(12,"Artem","Chibirev",40000);
        System.out.println(employee.toString());
        System.out.println(employee.getName() + " with annual salary: " + employee.getAnnualSalary());

        int percent = 25;
        System.out.println("Increase salary of " + employee.getName() +
                " by " + percent + "%. Now month salary is " + (employee.raiseSalary(percent)));
    }

    public static void checkBookAndAuthor(){
        //Book and Author
        Author author1 = new Author("J.Rowling", "JR@gmail.com",'f');
        Author author2 = new Author("A.Chibirev", "AC@ya.ru",'m');
        Author author3 = new Author("A.Asimov", "Aa@yahoo.com",'m');

        ArrayList<Author> authors = new ArrayList<Author>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        Book book = new Book ("Harry P", authors, 1000);
        System.out.println(book.getAuthorNames());
    }

    public static void checkMyPoint(){
        //MyPoint
        MyPoint point1 = new MyPoint(2,4);
        MyPoint point2 = new MyPoint(-1,4);

        System.out.println(point1.toString());
        System.out.println(point2.toString());
        System.out.println("Distance between point1 and point2 is " + point1.distance(point2));
    }

    public static void checkMyTriangle(){
        //Points
        MyPoint pt1 = new MyPoint(2,4);
        MyPoint pt2 = new MyPoint(-1,4);
        MyPoint pt3 = new MyPoint(-9,10);

        //Triangle
        MyTriangle triangle = new MyTriangle(pt1, pt2, pt3);
        System.out.println(triangle.getType());

    }

}
