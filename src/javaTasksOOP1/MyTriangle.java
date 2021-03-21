package javaTasksOOP1;

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
        double l1, l2, l3;
        l1 = v1.distance(v2);
        l2 = v2.distance(v3);
        l3 = v1.distance(v3);

        if(l1 == l2){
            if(l1 == l3){
                return  TriangleType.EQUILATERAL;
            } else return TriangleType.ISOSCELES;
        }
        if(l1 == l3){
            return TriangleType.ISOSCELES;
        } else if (l2 == l3){
            return TriangleType.ISOSCELES;
        } else return TriangleType.SCALENE;

    }
}
