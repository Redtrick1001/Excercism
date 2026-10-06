public class LogLine {
    private final String line;

    public LogLine(String logLine) {
        this.line = logLine;
    }

    public LogLevel getLogLevel() {
        String regex = "[(){}<>\\[\\]]";
        String level = this.line.split(":")[0].replaceAll(regex, "");
        switch (level) {
            case "TRC" -> {
                return LogLevel.TRACE;
            } case "DBG" -> {
                return LogLevel.DEBUG;
            } case "INF" -> {
                return LogLevel.INFO;
            } case "WRN" -> {
                return LogLevel.WARNING;
            } case "ERR" -> {
                return LogLevel.ERROR;
            } case "FTL" -> {
                return LogLevel.FATAL;
            }
            default -> {
                return LogLevel.UNKNOWN;
            }
        }
    }

    public String getOutputForShortLog() {
        String message = this.line.split(":")[1].strip();
        LogLevel level = this.getLogLevel();
        return level.getEncodedLogLevel() + ":" + message;

    }
}
