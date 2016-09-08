import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Game {
  private String[] mAnswers = {"BOAT", "HOUSE", "BRIAN", "YUSUF"};
  private Integer mAnswerIndex = -1;
  private List<Character> mPastGuesses = new ArrayList<Character>();
  private Word gameWord = new Word();
  public Game(){
    generateAnswerIndex();
    generateEncodedWord();
    generateWord();
  }
  private void generateAnswerIndex(){
    Random randomNumber = new Random();
    mAnswerIndex = randomNumber.nextInt(4);
  }
  public List<Character> addGuess(Character guess){
    mPastGuesses.add(guess);
    return mPastGuesses;
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
