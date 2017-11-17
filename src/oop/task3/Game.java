package oop.task3;

public class Game {
    private String name;
    private Player[] players;

    public Game(String name, int playersCount) {
        this.name = name;
        players = new Player[playersCount];
    }

    public void addPlayer(Player player){
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null){
                players[i] = player;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }


    public Player[] getPlayers() {
        return players;
    }

    public void winner(){
        int maxPoints = 0;
        Player maxPlayer = null;

        for (Player player : players) {
            if(player.getPoints() > maxPoints){
                maxPlayer = player;
                maxPoints = player.getPoints();
            }
        }

        if(maxPoints >= 100){
            System.out.println(maxPlayer.getFullName());
        }else{
            System.out.println("Nikt nie wygral");
        }

    }

}
