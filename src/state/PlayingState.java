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
public class PlayingState implements State{

    @Override
    public void pressPlay(VideoPlayerContext videoPlayerContext) {
        System.out.println("Video Player Playing State");
        videoPlayerContext.setState(this);
    }
    
    
    public String toString(){
        return "Playing State \n";
    }
    
}