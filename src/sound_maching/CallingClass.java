/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sound_maching;

import demo.sphinx.helloworld.GetFileName;

/**
 *
 * @author Shubham
 */
public class CallingClass extends Thread{
    
    public CallingClass(String name){
        this.name=name;
    }
    
    @Override
    public void run(){
        GetFileName names = new GetFileName();
        names.getFileName(name);
        
    }
    private String name;
    
    public static void main(String args[]){
        CallingClass classq=new CallingClass(("ganesh sir"));
        classq.start();
    }
}
