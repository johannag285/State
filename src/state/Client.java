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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VideoPlayerContext videoPlayerContex = new VideoPlayerContext();
        
        BeginningState beginnig = new BeginningState();
        beginnig.pressPlay(videoPlayerContex);
        System.out.println(videoPlayerContex.getSate().toString());
        
        StandByState standByState = new StandByState();
        standByState.pressPlay(videoPlayerContex);
        System.out.println(videoPlayerContex.getSate().toString());
        
        PlayingState playingState = new PlayingState();
        playingState.pressPlay(videoPlayerContex);
        System.out.println(videoPlayerContex.getSate().toString());
        
        FinishState finishState = new FinishState();
        finishState.pressPlay(videoPlayerContex);
        System.out.println(videoPlayerContex.getSate().toString());
    }
    
}
