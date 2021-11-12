public class Button {
    private Mediator mediator;
//    private Fan fan;

    // constructor, getters and setters
    public Button(){
        this.mediator = null;
//        fan = _fan;
//        fan.setButton(this);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press(){
        mediator.press();

//        if(fan.isOn()){
//            fan.turnOff();
//        } else {
//            fan.turnOn();
//        }
    }
}