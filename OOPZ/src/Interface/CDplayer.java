package Interface;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("Music is started sututututututu");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped");

    }
}
