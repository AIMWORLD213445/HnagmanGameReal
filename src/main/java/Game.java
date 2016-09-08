import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Game {
  private String[] mAnswers = {"BOAT", "HOUSE", "BRIAN", "YUSUF"};
  private Integer mAnswerIndex = -1;
  private List<Character> mPastGuesses = new ArrayList<Character>();
  public Word gameWord = new Word();
  public Integer getAnswerIndex(){
    Random randomNumber = new Random();
    mAnswerIndex = randomNumber.nextInt(4);
    return mAnswerIndex;
  }
  public List<Character> addGuess(Character guess){
    mPastGuesses.add(guess);
    return mPastGuesses;
  }
  public void setEncodedWord(){
    String word = mAnswers[mAnswerIndex];
    String[] arrayOfChar = word.split("");
    for (int i = 0;i < arrayOfChar.length ;i++ ) {
      arrayOfChar[i] = "_";
    }
     gameWord.encodedWord = arrayOfChar;
  }
  public void setWord(){
    String word = mAnswers[mAnswerIndex];
    String[] arrayOfChar = word.split("");
    gameWord.word = arrayOfChar;
  }
}
