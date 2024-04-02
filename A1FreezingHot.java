class A1FreezingHot extends ConsoleProgram {

  /**
  * output if one less 0 and other greater 100
  * @author: EdricLai
  */
  
  public void run() {
    // declare variables
    double temperature1;
    double temperature2;
    
    // user input
    temperature1 = readDouble("Enter temperature 1: ");
    temperature2 = readDouble("Enter temperature 2: ");

    // compare
    if (temperature1 < 0 || temperature2 < 0){
        if (temperature1 > 100 || temperature2 > 100) {
            System.out.println("true");
        }
    }
    else {
        System.out.println("false");
    }
  }
}