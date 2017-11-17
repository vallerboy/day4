package oop.task3;

public class Player {
    private String name;
    private int points;
    private String username;


    public Player(String name, int points, String username) {
        this.name = name;
        this.points = points;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName(){
        return name + " " + username;
    }
}
