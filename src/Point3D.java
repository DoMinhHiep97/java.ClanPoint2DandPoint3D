public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(){

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
       setXY(x,y);
       setZ(z);
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+","+getZ()+")";

    }

    public static void main(String[] args) {

        Point3D point3D=new Point3D();
        Point3D point3D1=new Point3D(5.0f);
        Point3D point3D2=new Point3D(2.0f,2.0f,3.0f);
        System.out.println(point3D);
        System.out.println(point3D1);
        System.out.println(point3D2);

    }
}
