public class P27 {
   
   public static void main(String[] args) {
      int count = 0;
      int y = 1;
      int x = 1;
      for(int k = 1; k<=100; k++) {
      
         x = k;
      
         for(int i = 1; i<= 100; i++) {
         
            y = i;
         
            if(1 <= y && x <= 100 && y <= x && i <= 100) {
               count++;
            }
                     
         }
      
      } 
   
      System.out.print(count);
   
   }


}