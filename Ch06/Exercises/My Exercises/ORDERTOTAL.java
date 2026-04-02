public static double getOrderTotal(int bp, int nb)
{
   double result = (bp *18.95) + (nb * 21.95);
   
      if(bp + nb > 3)
      {  
         result = (bp*18.95) + (nb*21.95);
      }
      else if(bp + nb >= 3 &&  bp + nb <12)
      {
         result = (bp +nb)*15.95;
      
      else if(bp + nb >= 12)
      {
         result = (bp +nb)*14.00;
      }
      else if(bp==1&&nb==1)
      {
         result = 37.95;
      }
      return result;
      }
      }