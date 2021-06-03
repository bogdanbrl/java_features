package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.interfaces.Button;
import creationalPatterns.abstractFactory.interfaces.CheckBox;
import creationalPatterns.abstractFactory.interfaces.GUIFactory;

public class Application {

    private Button button;
    private CheckBox checkBox;
    private GUIFactory guiFactory;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.paintButton();
        checkBox.paintCheckBox();
        System.out.println("You created the Application");
    }
}
