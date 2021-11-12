public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public Mediator(Button _button, Fan _fan, PowerSupplier _powerSupplier){
        button = _button;
        button.setMediator(this);
        fan = _fan;
        fan.setMediator(this);
        powerSupplier = _powerSupplier;
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}