/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;

/**
 *
 * @author Administrator
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class AudioRecorder02 extends JFrame{
    
    private String FileName;
    
//    public AudioRecorder02(String fileName){
//        this.FileName=fileName;
//    }
    
  AudioFormat audioFormat;
  TargetDataLine targetDataLine;

  final JButton captureBtn =
                          new JButton("Capture");
  final JButton stopBtn = new JButton("Stop");
  final JButton back = new JButton("Back");

  final JPanel btnPanel = new JPanel();
  final ButtonGroup btnGroup = new ButtonGroup();
  final JRadioButton aifcBtn =
                        new JRadioButton("AIFC");
  final JRadioButton aiffBtn =
                        new JRadioButton("AIFF");
  final JRadioButton auBtn =//selected at startup
                     new JRadioButton("AU",true);
  final JRadioButton sndBtn =
                         new JRadioButton("SND");
  final JRadioButton waveBtn =
                        new JRadioButton("WAVE");

  public static void main( String args[]){
    new AudioRecorder02("lucky");
  }//end main

  public AudioRecorder02(String fileName){//constructor
      
      this.FileName=fileName;
    captureBtn.setEnabled(true);
    stopBtn.setEnabled(false);
    back.setEnabled(true);

    //Register anonymous listeners
    captureBtn.addActionListener(
      new ActionListener(){
        public void actionPerformed(
                                  ActionEvent e){
          captureBtn.setEnabled(false);
          stopBtn.setEnabled(true);
          //Capture input data from the
          // microphone until the Stop button is
          // clicked.
          captureAudio();
        }//end actionPerformed
      }//end ActionListener
    );//end addActionListener()

    stopBtn.addActionListener(
      new ActionListener(){
        public void actionPerformed(
                                  ActionEvent e){
          captureBtn.setEnabled(true);
          stopBtn.setEnabled(false);
          //Terminate the capturing of input data
          // from the microphone.
          targetDataLine.stop();
          targetDataLine.close();
          dispose();
        }//end actionPerformed
      }//end ActionListener
    );//end addActionListener()
    
    
    

    //Put the buttons in the JFrame
    getContentPane().add(captureBtn);
    getContentPane().add(stopBtn);

    //Include the radio buttons in a group
    btnGroup.add(aifcBtn);
    btnGroup.add(aiffBtn);
    btnGroup.add(auBtn);
    btnGroup.add(sndBtn);
    btnGroup.add(waveBtn);

    //Add the radio buttons to the JPanel
    btnPanel.add(aifcBtn);
    btnPanel.add(aiffBtn);
    btnPanel.add(auBtn);
    btnPanel.add(sndBtn);
    btnPanel.add(waveBtn);

    //Put the JPanel in the JFrame
    getContentPane().add(btnPanel);

    //Finish the GUI and make visible
    getContentPane().setLayout(new FlowLayout());
//    setTitle("Copyright 2003, R.G.Baldwin");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(300,120);
    setVisible(true);
      setLocationRelativeTo(null);
  }//end constructor

  //This method captures audio input from a
  // microphone and saves it in an audio file.
  private void captureAudio(){
    try{
      //Get things set up for capture
      audioFormat = getAudioFormat();
      DataLine.Info dataLineInfo =
                          new DataLine.Info(
                            TargetDataLine.class,
                            audioFormat);
      targetDataLine = (TargetDataLine)
               AudioSystem.getLine(dataLineInfo);

      //Create a thread to capture the microphone
      // data into an audio file and start the
      // thread running.  It will run until the
      // Stop button is clicked.  This method
      // will return after starting the thread.
      new CaptureThread().start();
    }catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }//end catch
  }//end captureAudio method

  //This method creates and returns an
  // AudioFormat object for a given set of format
  // parameters.  If these parameters don't work
  // well for you, try some of the other
  // allowable parameter values, which are shown
  // in comments following the declarations.
  private AudioFormat getAudioFormat(){
    float sampleRate = 8000.0F;
    //8000,11025,16000,22050,44100
    int sampleSizeInBits = 16;
    //8,16
    int channels = 1;
    //1,2
    boolean signed = true;
    //true,false
    boolean bigEndian = false;
    //true,false
    return new AudioFormat(sampleRate,
                           sampleSizeInBits,
                           channels,
                           signed,
                           bigEndian);
  }//end getAudioFormat
//=============================================//

//Inner class to capture data from microphone
// and write it to an output audio file.
class CaptureThread extends Thread{
  public void run(){
    AudioFileFormat.Type fileType = null;
    File audioFile = null;

    //Set the file type and the file extension
    // based on the selected radio button.
    if(aifcBtn.isSelected()){
      fileType = AudioFileFormat.Type.AIFC;
      audioFile = new File("./sounds/"+FileName+".aifc");
    }else if(aiffBtn.isSelected()){
      fileType = AudioFileFormat.Type.AIFF;
      audioFile = new File("./sounds/"+FileName+".aif");
    }else if(auBtn.isSelected()){
      fileType = AudioFileFormat.Type.AU;
      audioFile = new File("./sounds/"+FileName+".au");
    }else if(sndBtn.isSelected()){
      fileType = AudioFileFormat.Type.SND;
      audioFile = new File("./sounds/"+FileName+".snd");
    }else if(waveBtn.isSelected()){
      fileType = AudioFileFormat.Type.WAVE;
      audioFile = new File("./sounds/"+FileName+".wav");
    }//end if

    try{
      targetDataLine.open(audioFormat);
      targetDataLine.start();
      AudioSystem.write(
            new AudioInputStream(targetDataLine),
            fileType,
            audioFile);
    }catch (Exception e){
      e.printStackTrace();
    }//end catch

  }//end run
}//end inner class CaptureThread
//=============================================//

}//end outer class AudioRecorder02.java
