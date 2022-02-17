package lesson1;

public class Robot implements Action {

public int maxHight = 100;
public int maxRange = 200;

    public int getMaxHight() {
        return maxHight;
    }

    public int getMaxRange() {
        return maxRange;
    }

    @Override
    public void run() {
        System.out.println("lesson1.Robot has riched the goal!");
    }

    @Override
    public void jump() {
        System.out.println("lesson1.Robot has riched the goal!");
    }

}
