package creationalPatterns.singleton;

public class Logger {

    private String lastMessage;

    private Logger() {    }

    private static final class LoggerHelper {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance(){
        return LoggerHelper.INSTANCE;
    }

    public void logMessage(String message){
        System.out.println("Mesajul este: " + message);
        lastMessage = message;
    }

    public String getLastMessage() {
        return lastMessage;
    }


}
