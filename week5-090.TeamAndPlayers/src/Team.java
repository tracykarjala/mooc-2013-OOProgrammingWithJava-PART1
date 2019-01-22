import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> list;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
        this.list = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if (!(size() >= maxSize)) {
            list.add(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return list.size();
    }

    public int goals() {
        int goals = 0;
        for (Player player: list) {
            goals += player.goals();
        }
        return goals;
    }

    public void printPlayers() {
        for (Player player: list) {
            System.out.println(player);
        }
    }
}
