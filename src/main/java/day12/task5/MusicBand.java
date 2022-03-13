package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtists = new ArrayList<>();
    ;

    public List<MusicArtist> getMembers() {
        return musicArtists;
    }

    public void setMembers(List<MusicArtist> members) {
        this.musicArtists = members;
    }

    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + musicArtists +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        int size = b.musicArtists.size();
        for (int i = 0; i < size+1; i++) {
            b.getMembers().add(a.getMembers().get(i));
        }
        a.getMembers().clear();
    }

    public void printMusicArtists(){
        int size = musicArtists.size();
        for (int i = 0; i < size; i++) {
            System.out.print(musicArtists);
        }

    }
}
