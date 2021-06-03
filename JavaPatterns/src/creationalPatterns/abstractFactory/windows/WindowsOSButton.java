package creationalPatterns.abstractFactory.windows;

import creationalPatterns.abstractFactory.interfaces.Button;

public class WindowsOSButton implements Button {

    @Override
    public void paintButton() {
        System.out.println("You created a Windows OS Button");
    }
}
