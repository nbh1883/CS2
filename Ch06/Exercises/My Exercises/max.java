public class max{

   public static int maxx(int x, int y, int z)
   {
       int a = Math.max(x,y);
       return Math.max(a,z);
   }
   public static int mazz(int x, int y, int z)
   {
      int a = 0;
      if(x>y)
         a = x;
      else if(x<y)
      {
         a = y;
      }
      if(a>z)
      {
      return a;
      }
      else if(a<z){
      return z;
      }
   }
}