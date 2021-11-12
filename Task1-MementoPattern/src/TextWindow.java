public class TextWindow {

    private StringBuilder currentText;

//    TextEditor has a text window, which holds the currently entered text, and provides a way to add more text:

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }


//    ORIGINATOR
//    We'll have to provide the TextWindow class with methods to create and consume the Memento object, making the TextWindow our Originator:
//    The save() method allows us to create the object, while the restore() method consumes it to restore the previous state.

    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState save) {
        currentText = new StringBuilder(save.getText());
    }

}