package javaTasksOOP1;

class MyPoint {
    private double x = 0;
    private double y = 0;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY(){
        return new double[]{x, y};
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ",y=" + y +
                ')';
    }

    //to zero-point
    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow((this.x - x),2)+Math.pow((this.y - y),2));
    }

    public double distance(MyPoint another){
        return Math.sqrt(Math.pow((x - another.getX()),2)+Math.pow((y - another.getY()),2));
    }

}
