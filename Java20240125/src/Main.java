import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music("calm1", "music/calm1.wav");
        Music music2 = new Music("calm2", "music/calm2.wav");
        Music music3 = new Music("calm3", "music/calm3.wav");

        MusicLibrary library = new MusicLibrary();
        library.addMusic(music1);
        library.addMusic(music2);
        library.addMusic(music3);

        library.playRandomSound();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to stop.");
        scanner.nextLine();
    }
}