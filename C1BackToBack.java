class C1BackToBack extends ConsoleProgram {

  /**
  * adds last letter to back and front
  * @author: EdricLai
  */
  
  public void run() {
    // declare variables
    String word;
    String lastChar;
    int letterCount;
    
    // user input data
    word = readLine("Enter a word: ");
    letterCount = word.length();

    // back-front addition
    lastChar = word.substring(letterCount - 1);
    System.out.println(lastChar + word + lastChar);
  }
}