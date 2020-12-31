package red.felnull.jltest;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestMain {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
   /*     AdvancedPlayer adp = new AdvancedPlayer(new FileInputStream("C:\\Users\\MORI\\Music\\playlist\\Brain Power.mp3"));
        Runnable r = () -> {
            int c = 0;
            boolean minas = false;
            while (true) {
                if (!minas)
                    c++;
                else
                    c--;

                if (c >= 200)
                    minas = true;
                else if (c <= 0)
                    minas = false;

                float baritu = (float) c / 100f;
                System.out.println(baritu);
                adp.setVolume(baritu);
                System.out.println(adp.getVolume());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread th = new Thread(r);
        th.start();
        adp.play();*/
    }
}
