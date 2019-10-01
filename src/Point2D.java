import java.lang.String;
public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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

    public void setXY(float x, float y) {
       setX(x);
       setY(y);
    }

    public float[] getXY() {
        return new float[]{x, y};
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        Point2D point2D1=new Point3D(7.0f,7.0f,6.0f);//test tính đa hình trỏ đến thằng con và chạy
        Point2D point2D2=new Point3D(6.0f);
        System.out.println(point2D);
        System.out.println(point2D1);
        System.out.println(point2D2);
    }
}
