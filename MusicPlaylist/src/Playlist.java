/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author liamm
 */
public class Playlist {
    private ArrayList<Song> songs;
    
    //Constructor
    public Playlist() {
        songs = new ArrayList<>();
    }
    
    //Method to add a song to the playlist
    public void addSong(Song song){
        songs.add(song);
    }
    
    //Method to remove a song from the playlist
    public void removeSong(Song song){
        songs.remove(song);
    }
    
    //Method to search for a song in the playlist based on its title
    public Song searchSong(String title){
        for (Song song : songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
    return null;
    }
    
    //Method to print the contents of the playlist
    public void printPlaylist(){
        for (Song song : songs){
            System.out.println(song);
        }
    }
    
    
    
}
