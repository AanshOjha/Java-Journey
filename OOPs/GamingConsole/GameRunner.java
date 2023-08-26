package OOPs.GamingConsole;

public class GameRunner {
        public static void main(String[] args) {
            GamingConsole[] game = {new ChessGame(), new MarioGame()};
            for (GamingConsole i : game) {
                i.up();
                i.down();
                i.left();
                i.right();
            }
        }
}
