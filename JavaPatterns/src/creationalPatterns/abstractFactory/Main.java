package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.interfaces.GUIFactory;
import creationalPatterns.abstractFactory.mac.MacOSGUIFactory;
import creationalPatterns.abstractFactory.windows.WindowsOSGUIFactory;

public class Main {

    public static void main(String[] args) {

        String OSName = System.getProperty("os.name").toLowerCase();
        System.out.println(OSName);

        GUIFactory guiFactory;
        Application application;

        if(OSName.contains("windows")){
            guiFactory = new WindowsOSGUIFactory();
        }else{
            guiFactory = new MacOSGUIFactory();
        }

        application = new Application(guiFactory);
        application.paint();
    }
}
