public class Cylinder
{
   private Circle c;
   private double height;
   
   public Cylinder(double ra,double ht)
   {
      c = new Circle(ra);
      height = ht;
   }
   
   public double getVolume()
   {
      return height * base;
    }
}
