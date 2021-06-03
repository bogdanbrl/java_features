package creationalPatterns.abstractFactory.mac;

import creationalPatterns.abstractFactory.interfaces.Button;

public class MacOSButton implements Button {


    @Override
    public void paintButton() {
        System.out.println("You created a Mac Os Button");
    }


}
