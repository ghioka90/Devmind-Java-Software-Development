package P2_ExOOP1_Optimizarea_Performantei;
public class LazyNumberDetails {
  private int number;
  private boolean cachedPerfect;
  private int lazyNoPerfect = 0;
  private boolean cachedPrime;
  private int lazyNoPrime = 0;
  private boolean cachedMagic;
  private int lazyNoMagic = 0;

  public LazyNumberDetails(int number) {
  this.number = number;
  }

  public void updateNumber(int no) {
    this.number = no;
  }

  public void isPerfect(){
    if (lazyNoPerfect == this.number){
      System.out.println( number + " is perfect number(cached): " + cachedPerfect);
    }
    else{
      lazyNoPerfect = number;
      algIsPerfect(number);
      System.out.println( number + " is perfect number(non-Cached): " + cachedPerfect);
    }
  }
  public void isPrime(){
    if (lazyNoPrime == this.number){
      System.out.println( number + " is prime number(cached): " + cachedPrime);
    }
    else{
      lazyNoPrime = number;
      algIsPrime(number);
      System.out.println( number + " is prime number(non-chached): " + cachedPrime);
    }
  }
  public void isMagic(){
    if (lazyNoMagic == this.number){
      System.out.println( number + " is magic number(cached): " + cachedMagic);
    }
    else{
      lazyNoMagic= number;
      algIsMagic(number);
      System.out.println( number + " is magic number(non-cached): " + cachedMagic);
    }
  }

  private boolean algIsPerfect (int number) {
    int i, Sum = 0 ;
    for(i = 1 ; i < number; i++) {
      if(number % i == 0)  {
        Sum = Sum + i;
      }
    }
    if (Sum == number) {
      cachedPerfect = true;
      return true;
    }
    else {
      cachedPerfect = false;
      return false;

    }
  }
  private boolean algIsPrime (int number){
    int i, count = 0;
    for (i = 2; i <= number/2; i++) {
      if(number % i == 0) {
        count++;
        break;
      }
    }
    if(count == 0 && number != 1 ){
      cachedPrime = true;
      return true;
    }
    else {
      cachedPrime = false;
      return false;

    }
  }
  private boolean algIsMagic (int number) {
    while (number > 9){
      number = digitSum(number);
    }
    if (number == 7 || number == 3 || number == 9){
      cachedMagic = true;
      return true;
    }
    else {
      cachedMagic = false;
      return false;
    }
  }
  private static int digitSum (int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }



}