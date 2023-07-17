import java.util.ArrayList;

public class Team {


    protected ArrayList<Player> players;
    protected ArrayList<Player> playersOnBench;
    protected ArrayList<Player>playersOnCourt;


    public Team() {

        players = new ArrayList<>();
        playersOnBench= new ArrayList<>();
        playersOnCourt =new ArrayList<>();

    }


    public void addPlayerToTeam(Player player){
        this.players.add(player);
        this.playersOnBench.add(player);
    }
    public void addPlayerToCourt(Player player){

            if (this.playersOnCourt.size() < 5) {
                this.playersOnCourt.add(player);
                this.playersOnBench.remove(player);
            } else {
                System.out.println("There are five players on the court. Cannot add more players.");
            }

    }

    public void SwapPlayer(Player playerOut, Player playerIn) {
        if (playersOnCourt.contains(playerOut) && playersOnBench.contains(playerIn)) {

            playersOnCourt.remove(playerOut);
            playersOnBench.add(playerOut);
            playersOnCourt.add(playerIn);
            playersOnBench.remove(playerIn);
        } else {System.out.println("One or both players are not in the expected positions.");}

    }
 }

