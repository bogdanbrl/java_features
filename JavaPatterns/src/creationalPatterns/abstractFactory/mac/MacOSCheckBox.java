package creationalPatterns.abstractFactory.mac;

import creationalPatterns.abstractFactory.interfaces.CheckBox;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paintCheckBox() {
        System.out.println("You created a Mac OS CheckBox");
    }
}
