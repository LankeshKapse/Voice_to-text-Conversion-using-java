/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sound_maching;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Administrator
 */
public class JavaAudioPlaySound {
    
    public static void main(String[] args) 
  throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "./sounds/test1.wav";
    InputStream in = new FileInputStream(gongFile);
 
    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);
 
    // play the audio clip with the audioplayer class
      System.out.println("");
    AudioPlayer.player.start(audioStream);
  }
    
}
