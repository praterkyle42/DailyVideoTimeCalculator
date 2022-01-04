package BusinessLayer;
import BusinessLayer.Video;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdpra
 */
public class VideoDataManager {
    private ArrayList<Video> video;
    
    public VideoDataManager() {
        this.video = new ArrayList<Video>(); 
    }
    
    public Video Create(Video newVideo) {
        this.video.add(newVideo); 
        return newVideo;
    }
    public ArrayList<Video> getAll() {
        return this.video;
    }
    public Video getByVideoNumber(int videonum) {
        Video outputVideo = new Video();        
        for(Video v : video) {
            if(v.getVideoNumber() == videonum) {
                outputVideo.setTotalSeconds(v.getTotalSeconds()); 
                outputVideo.setVideoNumber(v.getVideoNumber());
            }
        }
        return outputVideo;
    }
    public int getNumberOfVideos() {
        return video.size();
    }
    public void clear() {
        video.clear(); 
    }
    public int getVideoSum() {
        int sum = 0;
        int minutes;
        for(Video v : video) {
            minutes = v.getTotalSeconds();
            sum += minutes;
        }
        return sum;
    }
}
