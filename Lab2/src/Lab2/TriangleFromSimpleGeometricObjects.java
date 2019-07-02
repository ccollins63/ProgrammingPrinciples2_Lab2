//Cameron Collins

package Lab2;

public class  TriangleFromSimpleGeometricObjects extends SimpleGeometricObject {

   private Point A ;
   private Point B ;
   private Point C ;

   public TriangleFromSimpleGeometricObjects() {
      A= new Point();
      B= new Point();
      C = new Point();
   }

   public TriangleFromSimpleGeometricObjects(Point A, Point B, Point C) {
   
      this.A = A;
      this.B = B;
      this.C = C;
   }

   public Point getA() {
   
      return A;
   }

   public void setA(Point a) {
   
      A = a;
   }

   public Point getB() {
   
      return B;
   }

   public void setB(Point b) {
   
      B = b;
   }

   public Point getC() {
   
      return C;
   }

   public void setC(Point c) {
   
      C = c;
   }

   public double getArea() {
   
      double a = B.distanceTo(C);
      double b = C.distanceTo(A);
      double c = A.distanceTo(B);
   
      double s = ((a + b + c) / 2.0);
   
      double area = Math.round(Math.sqrt((s * (s - a) * (s - b) * (s - c))) * 100.0) / 100.0;
      return area;
   
   }

   public  double getPerimeter() {
   
      double a = B.distanceTo(C);
      double b = C.distanceTo(A);
      double c = A.distanceTo(B);
   
   //        double perimeter = Math.round((a + b + c) * 100.0) / 100.0;
   
      double perimeter = a + b + c;
      return perimeter;
   
   }

   public String toString(){
   
      return "The triangle with points (" + A.getX() + ", " + A.getY() + "), (" + B.getX() + ", " + B.getY() + "), (" + C.getX() + ", " + C.getY() + ") has a perimeter of " + getPerimeter() + " and an area of " + getArea() + ".";
   }
}