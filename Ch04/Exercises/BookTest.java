public class BookTest
{
   public static void main(String[] args)
   {
      Book david = new Book(3);
      
      for(int k = 0; k<3; k++)
      {
         System.out.println("The current page is: " + david.getCurrentPage());
         david.nextPage();
      }
   }
}