package  gui;

import javax.sound.sampled.*;
import java.io.File;

public class Sound {
    void play(String fileName){
        try {
            File file = new File(fileName);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }catch (Exception ignored){}
    }
}
