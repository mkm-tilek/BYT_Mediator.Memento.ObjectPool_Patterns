public class TextEditor {

    private TextWindow textWindow;

    private TextWindowState savedTextWindow;

//    INITIAL
//    This is an example of the Memento Design Pattern. Let's imagine we have a text editor:

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
        this.savedTextWindow = null;
    }

    public void write(String text){
        textWindow.addText(text);
    }

    public String print(){
        return savedTextWindow.getText();
    }

//    CARETAKER
//    Finally, we have to update our TextEditor class. As the Caretaker, it will hold the state of the Originator and ask to restore it when needed:
    public void hitSave() {
        savedTextWindow = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }
}