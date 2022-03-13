package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Member> members = new ArrayList<>();
    ;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public MusicBand(String name, int year, List<Member> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        int size = b.members.size();
        for (int i = 0; i < size; i++) {
            b.getMembers().add(a.getMembers().get(i));
        }
        a.getMembers().clear();
    }

    public void printMembers(){
        int size = members.size();
        for (int i = 0; i < size; i++) {
            System.out.print(members);
        }

    }

}
