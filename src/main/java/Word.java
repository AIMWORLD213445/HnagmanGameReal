import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Word{
  public String[] word;
  public String[] encodedWord;
  public void printWord(){
    System.out.println("hello");
    List<String> characterList = new ArrayList<String>(Arrays.asList(word));
    List<String> encodedCharacterList = new ArrayList<String>(Arrays.asList(encodedWord));
    System.out.println(characterList);
    System.out.println(encodedCharacterList);
  }
}
