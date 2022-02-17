package lesson1;

public class Cat implements Action{

    public int maxHight = 12;
    public int maxRange = 700;

    @Override
    public void run() {
        System.out.println("lesson1.Cat has riched the goal");
    }

    @Override
    public void jump() {
        System.out.println("lesson1.Cat has riched the goal");
    }
@Override
    public int getMaxHight() {
        return maxHight;
    }
@Override
    public int getMaxRange() {
        return maxRange;
    }


}
