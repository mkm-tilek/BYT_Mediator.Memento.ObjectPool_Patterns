import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MementoTest {
    private String text;
    private TextEditor textEditor;

    @Before
    public void before(){
        text = "The Memento Design Pattern\nHow to implement it in Java?\n";
        textEditor = new TextEditor(new TextWindow());
    }

    @Test
    public void write(){
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");

        textEditor.hitSave();

        textEditor.write("Buy milk and eggs before coming home\n");

        textEditor.hitUndo();

        Assert.assertEquals(text, textEditor.print());
    }


}
