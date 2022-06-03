import java.util.*;

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    public void getWinner () {
        Set entrySet = players.entrySet();

        int getMaxPoints = Collections.max(players.values());
        for (Map.Entry<String, Integer> entry : players.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==getMaxPoints) {
                System.out.println(entry.getKey() + " " + entry.getValue());     // Print the key with max value
            }
        }
    }

}

