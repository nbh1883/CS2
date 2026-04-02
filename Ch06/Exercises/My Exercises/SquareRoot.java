public boolean checkSquare(int n){

int actualNumber = n;

int squareRoot = (int)Math.sqrt(n);

int squaredNumber = Math.pow(squareRoot,2);

if(squaredNumber==actualNumber){

return true;

}
 else
  {
return false;
}

