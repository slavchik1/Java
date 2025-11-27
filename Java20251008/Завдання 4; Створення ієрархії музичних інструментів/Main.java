public class Main {
    public static void main(String[] args) {
        Drum drum = new Drum();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Instrument[] instruments = {drum, guitar, piano};
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}
