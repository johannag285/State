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
public class VideoPlayerContext {
    
    private State state;
    
    public VideoPlayerContext(){
        state = null;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public State getSate(){
        return state;
    }
    
}
