package oop.task3;

public class Main {
    public static void main(String[] args) {
        Game rpg = new Game("Metin2", 5);

        rpg.addPlayer(new Player("Oskar", 90, "Oskix"));
        rpg.addPlayer(new Player("Tadek", 91, "Taddix"));
        rpg.addPlayer(new Player("Kocek", 80, "Kociu"));
        rpg.addPlayer(new Player("Misiek", 24, "Lalla"));
        rpg.addPlayer(new Player("Damian", 24, "Damix"));

        rpg.winner();
    }
}
