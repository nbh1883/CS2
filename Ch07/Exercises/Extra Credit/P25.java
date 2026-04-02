public class P25 {
     
   public static void makeChange(int amt) {
      int count = 1;
   
      for(int q = 0; q*25<=amt; q++) {
         for(int d = 0; q*25 + d*10<=amt; d++) {
            for(int n = 0; q*25 + d*10 + n*5<=amt; n++) {
               int p = amt - (q*25 + d*10 + n*5);
               
               System.out.printf("%4d. %3d quarters %3d dimes %3d nickels %3d pennies\n", 
                  count, q, d, n, p);               
            
               count++;
            }
         }
      } 
   
   }

   public static void main(String[] args) {
      
      makeChange(30);
              
   }

}