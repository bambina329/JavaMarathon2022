package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand theBeatles = new MusicBand("The Beatles", 1960);
        MusicBand nirvana = new MusicBand("Nirvana", 1987);
        MusicBand linkinPark = new MusicBand("Linkin Park", 1996);
        MusicBand acdc = new MusicBand("AC/DC", 1973);
        MusicBand aerosmith = new MusicBand("Aerosmith", 1960);
        MusicBand gorillaz = new MusicBand("Gorillaz", 2000);
        MusicBand blink = new MusicBand("Blink-182", 2002);
        MusicBand buckcherry = new MusicBand("Buckcherry", 2001);
        MusicBand creed = new MusicBand("Creed", 2005);
        MusicBand argument = new MusicBand("Argument", 2009);
        MusicBand hoobastank = new MusicBand("Hoobastank", 2007);

        List<MusicBand> bands = new ArrayList<>(15);

        bands.add(theBeatles);
        bands.add(nirvana);
        bands.add(linkinPark);
        bands.add(acdc);
        bands.add(aerosmith);
        bands.add(gorillaz);
        bands.add(blink);
        bands.add(buckcherry);
        bands.add(creed);
        bands.add(argument);
        bands.add(hoobastank);

        System.out.println(bands);

        Collections.shuffle(bands);

        System.out.println(bands);

        groupsAfter2000(bands);
        //System.out.println(bands);


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>(15);
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                bandsAfter2000.add(band);
        }
        System.out.println(bandsAfter2000);
        return bandsAfter2000;

    }



}



