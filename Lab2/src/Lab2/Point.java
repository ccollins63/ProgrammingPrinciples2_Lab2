//Cameron Collins

package Lab2;

public class Point {
    //data fields
    private double x = 0.0;
    private double y = 0.0;

    public Point() {
    }

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }

    public double distanceTo(Point Point_2) {

        double distance;

        distance = Math.sqrt(Math.pow((Point_2.x - x), 2) + Math.pow((Point_2.y - y), 2));
        return distance;
    }
}
