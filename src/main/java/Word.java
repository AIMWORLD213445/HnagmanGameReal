import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Word{
  private String[] word;
  private String[] encodedWord;
  public List<String> printWord(){
    List<String> characterList = new ArrayList<String>(Arrays.asList(word));
    List<String> encodedCharacterList = new ArrayList<String>(Arrays.asList(encodedWord));
    // System.out.println(characterList);
    return encodedCharacterList;
  }
  public void setWord(String[] wordInput){
    word = wordInput;
  }
  public void setEncodedWord(String[] wordInput){
    encodedWord = wordInput;
  }
  public String[] getWord(){
    return word;
  }
  public String[] getEncodedWord(){
    return encodedWord;
  }
}
