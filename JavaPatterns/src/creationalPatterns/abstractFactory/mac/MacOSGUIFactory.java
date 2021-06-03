package creationalPatterns.abstractFactory.mac;

import creationalPatterns.abstractFactory.interfaces.Button;
import creationalPatterns.abstractFactory.interfaces.CheckBox;
import creationalPatterns.abstractFactory.interfaces.GUIFactory;

public class MacOSGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
