package ss6_inheritace_polimorhism.bai_tap.lop_point_2D_va_lop_point_3D;

public class  Point3D extends Point2D{
    float z = 0.0f;

    public Point3D (float z,float x, float y) {
        super(x,y);
        this.z = z;
    }
    public Point3D(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] setXYZ(float x,float y,float z){
        return new float[]{x,y,z};
    }
    public float[] getXYZ(){
        return new float[3];
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
