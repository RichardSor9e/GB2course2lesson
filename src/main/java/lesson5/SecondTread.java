package lesson5;

public class SecondTread extends Thread {

    public void run(){
        long b = System.currentTimeMillis();
        for (int i = 0; i < Main.h; i++) {

            Main.a2[i] = (float) (Main.a2[i] * Math.sin(0.2f + i / 5)
                    * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Скорость подсчета для 2.2 массива: " + (System.currentTimeMillis() - b));
    }

    }

