public class Human implements Action{

    public int maxHight = 3;
    public int maxRange = 2000;

    @Override
    public void run() {
        System.out.println("Human has riched the goal");
    }

    @Override
    public void jump() {
        System.out.println("Human has riched the goal");
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
