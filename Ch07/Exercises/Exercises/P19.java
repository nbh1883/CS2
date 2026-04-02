public class P19 {
   
   public static void main(String[] args) {
   
      for(int i = 1; i <= 12; i++) {
      
         System.out.print("|");
      
         for(int a = 1; a <= 12; a++) {
         

            if(a*i - 100 >= 0) {
               System.out.print(a*i + " |");
            } else if(a*i - 10 >= 0) {
               System.out.print(a*i + "  |");
            } else {
               System.out.print(a*i + "   |");
            }
      
         }
     
         System.out.println("\n|----|----|----|----|----|----|----|----|----|----|----|----|");
      
      }
   
   }


}