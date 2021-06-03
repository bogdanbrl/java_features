package creationalPatterns.abstractFactory.windows;

import creationalPatterns.abstractFactory.interfaces.CheckBox;

public class WindowsOSCheckBox implements CheckBox {
    @Override
    public void paintCheckBox() {
        System.out.println("You created a Windoes OS CheckBox");
    }
}
