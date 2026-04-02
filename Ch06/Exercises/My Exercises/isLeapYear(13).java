private boolean isLeapYear (int year)
{
   if(year % 4 != 0)
   {
      return false;
   }
   if (year % 100 ==0 && 400 != 0)
   {
      return false;
   }
   if ( year % 400 ==0)
   {
      return true;
   }
   return true;