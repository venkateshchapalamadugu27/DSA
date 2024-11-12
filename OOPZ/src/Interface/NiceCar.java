package Interface;

public class NiceCar {
    private Engine engine;
    private Media player=new CDplayer();
    public NiceCar(){
          engine=new powerEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void mediaStart(){
        player.start();
    }
    public void mediaStop(){
        player.stop();
    }

    public void upgrade(){
        this.engine=new electricEngine();
    }

}
