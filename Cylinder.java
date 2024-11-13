public class Cylinder extends Circle{
   public double height;
   Cylinder (){
       height=1.0;
   }
   public Cylinder(double radius){
       super(radius);
   }
   public Cylinder (double radius,double height){
       super(height);
   }
   public Cylinder(double radius,double height,String color){
       super(radius, color);
       this.height=height;
   }
   double getHeight()  {
       return height;
   }
   void setHeight(double height){
       this.height=height;
   }
   double getVolume(){
       return getArea()*height;
   }

}
