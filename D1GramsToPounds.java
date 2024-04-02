class D1GramsToPounds extends ConsoleProgram {

  /**
  * conversion table from grams to pounds
  * @author: EdricLai
  */
  
  public void run() {
    // declare variables
    int pounds;
    float grams;
    
    // headers
    System.out.printf("%6s %10s %n", "Grams", "Pounds");
    System.out.println("--------------------");

    // conversion
    for (pounds = 100; pounds <= 1000; pounds += 100){
        grams = pounds / 453.6f;
        System.out.printf("%6d %10.4f %n", pounds, grams);
    }
  }
}