import java.io.Console;

public class App {

  public static void main(String[] args) {
    Game myGame = new Game();
    while (myGame.getGameInProgress()) {
      System.out.println("Please guess a letter");
      System.out.println(myGame.getGameWord().printWord());
      Console myConsole = System.console();
      String userInput = myConsole.readLine().toUpperCase();
      myGame.addGuess(userInput);
      myGame.update();
    }
    System.out.println(myGame.getGameWord().printWord());
    System.out.println("Nice work, you guessed it!");
  }
}
