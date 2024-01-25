public class Music {
    private final String name;
    private final String path;

    public String getPath() {
        return path;
    }

    public Music(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public String toString() {
        return "name: \"" + name + "\"\n" + "path: \"" + path + "\"\n";
    }
}