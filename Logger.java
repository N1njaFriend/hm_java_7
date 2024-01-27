public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void info(String message) {
        System.out.println("[Результат] " + message);
    }

    public void warning(String message) {
        System.out.println("[Предупреждение] " + message);
    }

    public void error(String message) {
        System.err.println("[Ошибка] " + message);
    }
}