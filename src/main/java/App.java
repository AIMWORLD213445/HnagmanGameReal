public class App {
  public static void main(String[] args) {
    Game myGame = new Game();
    Integer randomNumber = myGame.getAnswerIndex();
    myGame.setEncodedWord();
    myGame.setWord();
    System.out.println(randomNumber);
    myGame.gameWord.printWord();
  }
}
