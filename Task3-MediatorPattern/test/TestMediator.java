import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class TestMediator {
    Fan fan;
    Button button;
    PowerSupplier powerSupplier;
    Mediator mediator;

    @Before
    public void before(){
        fan = new Fan();
        button = new Button();
        powerSupplier = new PowerSupplier();
        mediator = new Mediator(button, fan, powerSupplier);
    }

    @Test
    public void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        Assert.assertFalse(fan.isOn());

        button.press();
        Assert.assertTrue(fan.isOn());

        button.press();
        Assert.assertFalse(fan.isOn());


    }


}
