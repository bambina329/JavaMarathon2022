package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> memberList = new ArrayList<>();

        memberList.add(new MusicArtist("Grace Slick", 50));
        memberList.add(new MusicArtist("Marty Balin", 35));
        memberList.add(new MusicArtist("Paul Kantner", 24));
        memberList.add(new MusicArtist("Jorma Kaukonen", 40));


        MusicBand musicBand1 = new MusicBand("Blink", 1980, memberList);
        System.out.println(musicBand1);


        List<MusicArtist> memberList2 = new ArrayList<>();

        memberList2.add(new MusicArtist("John Lennon", 32));
        memberList2.add(new MusicArtist("Paul McCartney", 54));
        memberList2.add(new MusicArtist("Ringo Starr", 61));

        MusicBand musicBand2 = new MusicBand("Mary", 1990, memberList2);
        System.out.println(musicBand2);


        MusicBand.transferMembers(musicBand1, musicBand2);

        System.out.println(musicBand1);
        System.out.println(musicBand2);


    }
}
