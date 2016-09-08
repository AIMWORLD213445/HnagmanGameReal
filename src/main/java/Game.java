import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Game {
  private String[] mAnswers = {"BOAT", "HOUSE", "BRIAN", "YUSUF"};
  private Integer mAnswerIndex = -1;
  private List<String> mPastGuesses = new ArrayList<String>();
  private Word gameWord = new Word();
  private boolean gameInProgress = true;
  public void update(){
    String[] word = gameWord.getWord();
    String[] encodedWord = gameWord.getEncodedWord();
    String wordString = String.join("", word);
    String encodedWordString = String.join("", encodedWord);
    if (wordString.equals(encodedWordString)) {
      gameInProgress = false;
    }

  }
  public Game(){
    generateAnswerIndex();
    generateEncodedWord();
    generateWord();
  }
  private void generateAnswerIndex(){
    Random randomNumber = new Random();
    mAnswerIndex = randomNumber.nextInt(4);
  }
  public List<String> addGuess(String guess){
    mPastGuesses.add(guess);
    evaluateGuess(guess);
    return mPastGuesses;
  }
  private void evaluateGuess(String guess){
    String[] word = gameWord.getWord();
    String[] encodedWord = gameWord.getEncodedWord();
    for (int i = 0;i < word.length;i++ ) {
      if (word[i].equals(guess)) {
        encodedWord[i] = guess;
      }
    }
    gameWord.setWord(word);
    gameWord.setEncodedWord(encodedWord);
  }
  public boolean getGameInProgress(){
    return gameInProgress;
  }
  public Word getGameWord(){
    return gameWord;
  }
  private void generateEncodedWord(){
    String word = mAnswers[mAnswerIndex];
    String[] arrayOfChar = word.split("");
    for (int i = 0;i < arrayOfChar.length ;i++ ) {
      arrayOfChar[i] = "_";
    }
     gameWord.setEncodedWord(arrayOfChar);
  }
  private void generateWord(){
    String word = mAnswers[mAnswerIndex];
    String[] arrayOfChar = word.split("");
    gameWord.setWord(arrayOfChar);
  }
}
