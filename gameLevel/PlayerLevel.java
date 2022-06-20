package gameLevel;

import java.util.ArrayList;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count){//final 재정의 x
        run();
        for(int i=0; i < count; i++){
            jump();
        }
        turn();
    }
}
