import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class WordTest {
  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("dog");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void getWord_returnsValidText_String() {
    Word myWord = new Word("dog");
    assertEquals("dog", myWord.getWord());
  }

  @Test
  public void addDefinition_addedToList_2() {
    Word myWord = new Word("dog");
    Definition myDef1 = new Definition("an animal that barks");
    Definition myDef2 = new Definition("derogatory slang");
    myWord.addDefinition(myDef1);
    myWord.addDefinition(myDef2);
    assertEquals(2, myWord.getDefinitions().size());
  }
}
