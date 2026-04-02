public class P16 {

   public static void main(String[] args) {
   
      int a = 37, b = 2;
      
      int c = 1;
      while(c <= a) {
      
         a-=c;
         c*=b;
      
      }
      
      System.out.print(a);
   
   }

}