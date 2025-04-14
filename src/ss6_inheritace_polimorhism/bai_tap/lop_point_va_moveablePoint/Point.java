package ss6_inheritace_polimorhism.bai_tap.lop_point_va_moveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;


    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] setXY(float x,float y){
        return new float[]{x,y};
    }
    public float[] getXY(){
        return new float[2];
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
