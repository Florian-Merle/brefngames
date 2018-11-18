package Game.Games.TicTacToe.TicTacToeModel;

public class Circle extends Pawn {

    @Override
    public String toString() {
        return ("o");
    }

    public Circle(Player player, int x, int y) {
        super(player, x, y);
    }
}
