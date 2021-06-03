package creationalPatterns.abstractFactory.windows;

import creationalPatterns.abstractFactory.interfaces.Button;
import creationalPatterns.abstractFactory.interfaces.CheckBox;
import creationalPatterns.abstractFactory.interfaces.GUIFactory;

public class WindowsOSGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsOSCheckBox();
    }
}
