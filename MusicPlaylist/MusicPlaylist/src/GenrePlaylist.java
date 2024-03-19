/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author liamm
 */
public class GenrePlaylist extends Playlist {
    private String genreName;
    private List<String> songs;

  public GenrePlaylist(String genreName) {
        this.genreName = genreName;
        this.songs = new ArrayList<>();
    }

    public String getGenreName() {
        return genreName;
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public List<String> getSongs() {
        return new ArrayList<>(songs); // Return a copy of the songs list to prevent direct modification
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Genre: ").append(genreName).append("\n");
        for (String song : songs) {
            builder.append(song).append("\n");
        }
        return builder.toString();
    }
}

