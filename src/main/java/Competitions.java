public class Competitions {



    public static void start (){

        Cat theCat = new Cat();
        Human theHuman = new Human();
        Robot theRobot = new Robot();
        Wall theWall = new Wall();
        Treadmill theTreadmill = new Treadmill();



        Action [] actions = {theRobot, theCat, theHuman};
        WallAndTrace[] wallAndTraces = {theWall, theTreadmill};


        for (int i = 0; i < actions.length; i++) {
            for (int j = 0; j <wallAndTraces.length; j++) {
if (wallAndTraces[j] == theWall)
    if (actions[i].getMaxHight() >= wallAndTraces[j].getMaxHight())
        actions[i].jump();
    else System.out.println(actions[i].getClass() + " couldn't jump");
        else if (actions[i].getMaxRange() >= wallAndTraces[j].getMaxRange()) actions[i].run();
        else System.out.println(actions[i].getClass() + " couldn't run");
        ;

            }


        }
    }
}
