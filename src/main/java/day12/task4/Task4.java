package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Member> memberList = new ArrayList<>();

        memberList.add(new Member("Bob", "Marley"));
        memberList.add(new Member("Rib", "Ribol"));

        MusicBand musicBand1 = new MusicBand("Blink", 1980, memberList);
        System.out.println(musicBand1);


        List<Member> memberList2 = new ArrayList<>();

        memberList2.add(new Member("Barbie", "Mattel"));
        memberList2.add(new Member("Princess", "Hasbro"));

        MusicBand musicBand2 = new MusicBand("Mary", 1990, memberList2);
        System.out.println(musicBand2);


        MusicBand.transferMembers(musicBand1, musicBand2);

        System.out.println(musicBand1);
        System.out.println(musicBand2);

        musicBand2.printMembers();


    }
}
