package javaTasksOOP1;

import java.math.BigDecimal;

class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.v1.setXY(x1,y1);
        this.v2.setXY(x2,y2);
        this.v3.setXY(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double calculatePerimeter(){
        return v1.distance(v2) +v1.distance(v3) + v2.distance(v3);
    }

    public Enum getType(){
        BigDecimal l1 = new BigDecimal(v1.distance(v2));
        BigDecimal l2 = new BigDecimal(v2.distance(v3));
        BigDecimal l3 = new BigDecimal(v1.distance(v3));

        if(l1.compareTo(l2) == 0){
            if(l1.compareTo(l3) == 0){
                return  TriangleType.EQUILATERAL;
            } else return TriangleType.ISOSCELES;
        }
        if(l1.compareTo(l3) == 0){
            return TriangleType.ISOSCELES;
        } else if (l2.compareTo(l3) == 0){
            return TriangleType.ISOSCELES;
        } else return TriangleType.SCALENE;

    }
}
