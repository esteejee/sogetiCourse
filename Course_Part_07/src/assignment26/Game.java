package assignment26;

public class Game {
    private String title;
    private Player player1;
    private Player player2;

    public void printScoreBord() {
        System.out.println (String.format ("### Scoreboard of the game %s ###", title));
        System.out.println (String.format ("Player one %s has a score %d", player1.getName (), player1.getScore ()));
        System.out.println (String.format ("Player two %s has a score of %d ", player2.getName (), player2.getScore ()));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
