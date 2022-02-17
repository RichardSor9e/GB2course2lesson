package lesson1;

public class Treadmill implements WallAndTrace {

public static int range = 1000;
    public static int hight = 0;





    @Override
    public int getMaxHight() {
        return hight;
    }

    @Override
    public int getMaxRange() {
        return range;
    }
}
