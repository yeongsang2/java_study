package gameLevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빠리 댕김");

    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돔");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("SuperLevel ");
    }
}
