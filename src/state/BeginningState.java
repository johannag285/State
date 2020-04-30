/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Johanna
 */
public class BeginningState implements State{

    @Override
    public void pressPlay(VideoPlayerContext videoPlayerContext) {
        System.out.println("Video player start state");
        videoPlayerContext.setState(this);
    }
    
    
    @Override
    public String toString(){
        return  "Start State \n";
    }
}
