package red.felnull.jltest;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestMain {
    public static void main(String[] args) throws JavaLayerException, FileNotFoundException {
        Player player = new Player(new BufferedInputStream(new FileInputStream("C:\\Users\\MORI\\Music\\playlist\\01 茜空.mp3")));
        player.play();
    }
}
