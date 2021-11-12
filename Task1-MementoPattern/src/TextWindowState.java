public class TextWindowState {

//    MEMENTO
//    Now, let's imagine we want our text editor to implement some save and undo features.
//    When saving, we want our current text to be saved.
//    Thus, when undoing subsequent changes, we'll have our saved text restored.

//    In order to do that, we'll make use of the Memento Design Pattern. First, we'll create an object holding the current text of the window:

    private String text;

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


//    This object is our Memento. As we can see, we choose to use String instead of StringBuilder to prevent any update of the current text by outsiders.
}