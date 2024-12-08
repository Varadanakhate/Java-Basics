package Debugging;
import java.util.ArrayList;
import java.util.List;


public class Voters {
    List<String> voterList = new ArrayList<>();
    public Voters(){
        voterList.add("v1");
        voterList.add("v2");
        voterList.add("v3");
        voterList.add("v4");
        voterList.add("v5");

    }

    public static void main(String[] args) {
        Voters voters= getVoters1();
        System.out.println(voters.voterList);
        voters.voterList.remove("v1");
        System.out.println(voters.voterList);
    }

    private static Voters getVoters1() {
        return getVoters();
    }

    private static Voters getVoters() {
        return new Voters();
    }
}
