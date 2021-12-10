package Point2D_Point3D;

import java.util.Arrays;

public class MainPoint2D_Point3D {
    public static void main(String[] args) {
        System.out.println(new Point2D(3,4));
        System.out.println(new Point3D(4,3,5));

        System.out.println(Arrays.toString(new Point2D(3, 4).getXY()));
        System.out.println(Arrays.toString(new Point3D(4, 4, 5).getXYZ()));
    }
}
