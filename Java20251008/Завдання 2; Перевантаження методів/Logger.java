class Logger {
    public void log(String message) {
        System.out.println("LOG: " + message);
    }

    public void log(int statusCode) {
        System.out.println("STATUS: " + statusCode);
    }

    public void log(String message, int statusCode) {
        System.out.printf("LOG LEVEL %s: %s", statusCode, message);
    }
}
