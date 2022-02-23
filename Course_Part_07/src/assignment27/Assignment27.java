package assignment27;

public class Assignment27 {
    public static void main(String[] args) {

        Player player1 = new Player ("Thomas");
        player1.setScore (33);
        Player player2 = new Player ("Yvette");
        player2.setScore (50);
        Game chess = new Game ("Schaken", player1, player2);
        chess.printScoreBord ();

        Player player3 = new Player ("Jacob");
        player3.setScore (40);
        Player player4 = new Player ("Yvonne");
        player4.setScore (40);
        Game stratego = new Game ("Stratego", player3, player4);
        stratego.printScoreBord ();
    }
}
