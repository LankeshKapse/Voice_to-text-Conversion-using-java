/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.sphinx.helloworld;

import dbConnection.DBConnetionClass;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import sound_maching.AudioPlayerExample1;
import sound_maching.PlayAudioFile;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Umesh
 */
public class GetFileName {
    
    public GetFileName(){
        dbObj=new DBConnetionClass();
    }
    
    
    public void getFileName(String name){
        try{
            System.out.println("get File name calling....");
            ResultSet rst = dbObj.st.executeQuery("select stffName,staffVoice from stafftbl");
            while(rst.next()){
                String dbName=rst.getString(1);
                String voiceName=rst.getString(2);
                if(dbName.equalsIgnoreCase(name)){
                    voiceFile=voiceName;
                    System.out.println("voice file name: "+voiceFile);
                    break;
                }
            }
            play2();
        }catch(SQLException ex){ex.printStackTrace();}
    }
    
    public void play(){
         try {
            String gongFile = voiceFile;
            InputStream in = new FileInputStream(gongFile);

            // create an audiostream from the inputstream
            AudioStream audioStream = new AudioStream(in);

            // play the audio clip with the audioplayer class
            System.out.println("");
            AudioPlayer.player.start(audioStream);
        } catch (Exception ex) {
        }
    }
    
    private DBConnetionClass dbObj;
    private String voiceFile;
    
    void play2(){
           String audioFilePath = voiceFile;
        AudioPlayerExample1 player = new AudioPlayerExample1();
        player.play(voiceFile);
    }
    public static void main(String [] args){
        GetFileName file=new GetFileName();
        file.getFileName("ganesh sir");
    }
}
