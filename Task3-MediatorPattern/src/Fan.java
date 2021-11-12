public class Fan {
    private Mediator mediator;
//    private Button button;
//    private PowerSupplier powerSupplier;
    private boolean isOn = false;

    // constructor, getters and setters

    public Fan(){
        this.mediator = null;

//        button = null;
//        powerSupplier = new PowerSupplier();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //    public void setButton(Button _button){
//        this.button = _button;
//    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    //    public void turnOn() {
//        powerSupplier.turnOn();
//        isOn = true;
//    }
//
//    public void turnOff() {
//        isOn = false;
//        powerSupplier.turnOff();
//    }


    public Boolean isOn(){
        return isOn;
    }
}