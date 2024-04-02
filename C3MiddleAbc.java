class C3MiddleAbc extends ConsoleProgram {

  /**
  * abc middle detection
  * @author: EdricLai
  */
  
  public void run() {
    // initializes variables
    String word = readLine("Enter a word: ");
    String word2 = "abc";
    String wordMiddle;
    int wordCount = word.length();
    int word2Count = word2.length();

    // retrieves word in middle
    wordCount = wordCount / 2 - word2Count / 2;
    word2Count += wordCount;
    wordMiddle = word.substring(wordCount, word2Count);

    // comparison
    if (wordMiddle.equals(word2)) {
        System.out.println("true");
    }
    else {
        System.out.println("false");
    }
  }
}