public class P12 {


   public static int sumDigits(int n) {
      
      String number = n + "";
      
      int sum = 0;
      
      for(int i=0; i<number.length(); i++) {
        sum+=Character.getNumericValue(number.charAt(i));              
      }
      
      return sum;
   
   }
   
   public static void main(String[] args) {
   
      System.out.print(sumDigits(1111111111));
   
   }


}