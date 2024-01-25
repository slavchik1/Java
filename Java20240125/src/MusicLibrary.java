import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<Music> music = new ArrayList<>();

    public void addMusic(Music music) {
        if (this.music.contains(music) ) {
            System.out.println("Немає вільного місця!");
        } else {
            this.music.add(music);
        }
    }

    public void deleteMusic(Music music) {
        for(Music music1 : this.music) {
            if (Objects.equals(music1, music)) {
                this.music.remove(music1);
            } else {
                System.out.println("Такої музики не існує!");
            }
        }
    }

    public void playRandomSound() {
        try {
            Random random = new Random();
            Music m = this.music.get(random.nextInt(this.music.size()));
            System.out.printf("Music: %s", m);
            File soundFile = new File(m.getPath());
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Playing");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Музика: ");
        music.forEach(builder::append);
        return builder.toString();
    }
}