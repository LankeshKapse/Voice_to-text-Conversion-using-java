/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sound_maching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Administrator
 */
public class PlayAudioFile {
    
    public void plyFile(String FileName){
        InputStream in = null;
        try {
            String gongFile = FileName;
            in = new FileInputStream(gongFile);
            // create an audiostream from the inputstream
            AudioStream audioStream = new AudioStream(in);
            // play the audio clip with the audioplayer class
            System.out.println("");
            AudioPlayer.player.start(audioStream);
            
            System.out.println("file finished");
        } catch (Exception ex) {
            Logger.getLogger(PlayAudioFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (Exception ex) {
                Logger.getLogger(PlayAudioFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args){
        new PlayAudioFile().plyFile("./sounds/test1.wav");
    }
    
}
