/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdpra
 */
public class Video {
    private int totalSeconds; 
    private int videoNumber;
    public Video(int minutes, int seconds, int videonum) {
        int minutesAsSeconds = minutes * 60; 
        this.totalSeconds = minutesAsSeconds + seconds; 
        this.videoNumber = videonum; 
    }
    public Video(int minutes, int seconds) {
        int minutesAsSeconds = minutes * 60; 
        this.totalSeconds = minutesAsSeconds + seconds; 
    }
    public Video() {
        this.totalSeconds = 0; 
    }
    public int getTotalSeconds() {
        return totalSeconds;
    }

    public void setTotalSeconds(int totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public int getVideoNumber() {
        return videoNumber;
    }

    public void setVideoNumber(int videoNumber) {
        this.videoNumber = videoNumber;
    }
    
}
