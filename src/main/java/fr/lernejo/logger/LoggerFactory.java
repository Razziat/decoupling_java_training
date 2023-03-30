package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name){
        return new CompositeLogger(new FileLogger("log.txt"), new ContextualLogger(name, new ConsoleLogger()));
    }
}
