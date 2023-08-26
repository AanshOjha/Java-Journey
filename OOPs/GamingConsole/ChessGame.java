package OOPs.GamingConsole;

public class ChessGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Move king up");
    }

    @Override
    public void down() {
        System.out.println("Move king down");
    }

    @Override
    public void left() {
        System.out.println("Move king left");
    }

    @Override
    public void right() {
        System.out.println("Move king right");
    }
    
}
