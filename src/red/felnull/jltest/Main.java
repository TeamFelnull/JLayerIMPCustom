package red.felnull.jltest;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        AdvancedPlayer adp = new AdvancedPlayer(new FileInputStream("C:\\Users\\MORI\\Music\\playlist\\サカナクション  新宝島.mp3"));
        adp.play();
    }
}
