public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].strip();
    }

    public static String logLevel(String logLine) {
        String regex = "[(){}<>\\[\\]]";
        return logLine.split(":")[0].strip().replaceAll(regex, "").toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
