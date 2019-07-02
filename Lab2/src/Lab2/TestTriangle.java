//Cameron Collins

package Lab2;

public class TestTriangle {
    public static void main(String args[]){



        Point A = new Point (1 , 3);
        Point B = new Point (-2, -2);
        Point C = new Point (3 , -1);

        TriangleFromSimpleGeometricObjects triangle = new TriangleFromSimpleGeometricObjects(A, B, C);

        System.out.println(triangle);
    }
}
