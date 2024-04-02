import java.util.Random;

class B1DiceGame extends ConsoleProgram {
    
  /**
  * dice roll point system
  * @author: EdricLai
  */

  public void run() {
    // declare variables
    Random diceRandom = new Random();
    int diceValue1;
    int diceValue2;
    int rollCount;

    // simulates 100 rolls
    for (rollCount = 1; rollCount <= 100; rollCount++){
      // myRandom.nextInt((max - min) + 1) + min;
      diceValue1 = diceRandom.nextInt((6 - 1) + 1) + 1;
      diceValue2 = diceRandom.nextInt((6 - 1) + 1) + 1;

      // prints rolls
      System.out.print(rollCount + " | Roll 1: " + diceValue1 + " | Roll 2: " + diceValue2 + " | ");

      // pair combos
      if (diceValue1 + diceValue2 == 2){
        System.out.println("snake eyes!");
      }
      else if (diceValue1 + diceValue2 == 7){
        System.out.println("lucky seven!");
      }
      else{
        System.out.println("no combo!");
      }
    }
  }
}