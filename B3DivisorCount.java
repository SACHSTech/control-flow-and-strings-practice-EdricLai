class B3DivisorCount extends ConsoleProgram {

  /**
  * divisor count
  * @author: EdricLai
  */
  
  public void run() {
    // initializes variables
    int divisor;
    int integer = readInt("Enter an integer: ");

    // prints all divisors
    for (divisor = 1; divisor <= integer; divisor++){
      if (integer % divisor == 0){
        System.out.println(divisor);
      }
    }
  }
}