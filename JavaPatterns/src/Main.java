import behavioralPatterns.observerPattern.MyTopic;
import behavioralPatterns.observerPattern.MyTopicSubscriber;
import behavioralPatterns.observerPattern.Observer;
import creationalPatterns.singleton.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        observerPatternExample();

       

    }

    public static void singletonPatternExample(){
        Logger.getInstance().logMessage("Singleton pattern");
        Logger.getInstance().logMessage("pattern");
        Logger.getInstance().logMessage("singleton");
        System.out.println(Logger.getInstance().getLastMessage());
    }

    public static void observerPatternExample(){
        MyTopic topic = new MyTopic();

        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");
        Observer obj4 = new MyTopicSubscriber("Obj4");
        Observer obj5 = new MyTopicSubscriber("Obj5");

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        topic.register(obj4);
        topic.register(obj5);

        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);
        obj4.setSubject(topic);
        obj5.setSubject(topic);

        obj1.update();
        obj2.update();
        obj5.update();

        topic.postMessage("New Message");

        obj1.update();
        obj2.update();
        obj5.update();
    }



}
