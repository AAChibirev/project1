package javaTasksOOP2;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth(){
        return x2 - x1;
    }

    public int getHeight(){
        return y2 - y1;
    }

    //return TRUE if ball collides vertical border
    public boolean collidesWithVerticalBorder(Ball ball){

        if (((ball.getX() - ball.getRadius()) <= x1) || ((ball.getX() + ball.getRadius()) >= x2)) {
            System.out.println("Collision with vertical border\nBall: "+ball.getX() + "," + ball.getY() + ",r="+ball.getRadius());
            return true;
        }
        return false;

    }

    //return TRUE if ball collides horizontal border
    public boolean collidesWithHorizontalBorder(Ball ball){
        if (((ball.getY() - ball.getRadius()) <= y1) || ((ball.getY() + ball.getRadius()) >= y2)) {
            System.out.println("Collision with horizontal border\nBall: "+ball.getX() + "," + ball.getY() + ",r="+ball.getRadius());
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "Container{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
